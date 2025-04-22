package PPE301.ARMP.__1.Services;


import PPE301.ARMP.__1.Controller.AuthenticationRequest;
import PPE301.ARMP.__1.Controller.AuthenticationResponse;
import PPE301.ARMP.__1.Controller.RegisterRequest;
import PPE301.ARMP.__1.Models.Role;
import PPE301.ARMP.__1.Repository.UserRepository;
import PPE301.ARMP.__1.Config.jwtService;
import PPE301.ARMP.__1.Models.User;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final jwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var user =  User.builder()
          .role(Role.PARENT)
          .password(passwordEncoder.encode(request.getPassword()))
          .email(request.getEmail())
          .prenom(request.getPrenom())
          .nom(request.getNom())
         .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }
}
