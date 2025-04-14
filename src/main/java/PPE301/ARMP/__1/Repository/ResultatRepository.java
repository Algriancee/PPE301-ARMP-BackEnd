package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.Resultat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultatRepository extends JpaRepository<Resultat, Long> {


    // Récupérer les résultats d’un élève
    //List<Resultat> findByEleveId(Long eleveId);

    // Récupérer les résultats d’un élève pour un exercice précis
    //List<Resultat> findByEleveIdAndExerciceId(Long eleveId, Long exerciceId);

    // Récupérer les résultats d’une classe
    List<Resultat> findByNiveau(String niveau);

    List<Resultat> findByExerciceId(Long exerciceId);
}
