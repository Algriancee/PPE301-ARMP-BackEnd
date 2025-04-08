package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Role;
import PPE301.ARMP.__1.Models.User;
import PPE301.ARMP.__1.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Récupérer un utilisateur par ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Récupérer tous les élèves
    public List<User> getAllEleves() {
        return userRepository.findByRole(Role.valueOf("ELEVE"));
    }

    // Ajouter un utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Supprimer un utilisateur
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
