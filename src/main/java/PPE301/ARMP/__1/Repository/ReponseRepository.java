package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.Reponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReponseRepository extends JpaRepository<Reponse, Long> {

    // Trouver les réponses d’un élève
    List<Reponse> findByEleveId(Long eleveId);

    // Trouver les réponses pour un exercice donné
    List<Reponse> findByExerciceId(Long exerciceId);
}
