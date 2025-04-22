package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.User;
import PPE301.ARMP.__1.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Récupérer les utilisateurs selon leur rôle
    List<User> findByRole(Role role);
    // Utilisation de l'énumération Role au lieu de String
    Optional<User> findByEmail(String email);

    // Récupérer un élève par ID et son rôle
    //List<User> findByIdAndRole(Long id, Role role);  // Vous pouvez réactiver cette méthode si besoin

    // Récupérer les élèves d’un parent (supposant que vous avez une relation parent-enfant)
    //List<User> findByParentId(Long parentId);  // Remplacer 'findByUser' par 'findByParentId' si nécessaire

    // Récupérer les élèves d’une classe spécifique
    //List<User> findByNiveau(String niveau);  // Si le niveau est un champ de User

}
