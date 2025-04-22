package PPE301.ARMP.__1.Controller;


import PPE301.ARMP.__1.Models.User;
import PPE301.ARMP.__1.Services.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/eleves")
    public List<User> getAllEleves() {
        return userService.getAllEleves();
    }

    @GetMapping("/Parents")
    public List<User> getAllParents() {
        return userService.getAllParents();
    }

    @GetMapping("/Enseignants")
    public List<User> getAllEnseignants() {
        return userService.getAllEnseignants();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
