package PPE301.ARMP.__1.Repository;

import PPE301.ARMP.__1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<User, Long> {

    List<User> findByRole(String role);
}
