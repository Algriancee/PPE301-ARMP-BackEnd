package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Récupérer les utilisateurs selon leur rôle
    List<User> findByRole(String role);

    // Récupérer un élève par ID (vérifier si c’est bien un élève)
    List<User> findByIdAndRole(Long id, String role);

    // Récupérer les élèves d’un parent
    List<User> findByParentId(Long parentId);

    // Récupérer les élèves d’une classe spécifique
    List<User> findByClasse(String classe);
}
