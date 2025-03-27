package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.Correction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CorrectionRepository extends JpaRepository<Correction, Long> {

    // Récupérer les corrections par élève
    List<Correction> findByEleveId(Long eleveId);

    // Récupérer les corrections d’un exercice
    List<Correction> findByExerciceId(Long exerciceId);
}
