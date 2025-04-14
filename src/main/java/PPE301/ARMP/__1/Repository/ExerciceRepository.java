package PPE301.ARMP.__1.Repository;


import PPE301.ARMP.__1.Models.Exercice;
import PPE301.ARMP.__1.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ExerciceRepository  extends JpaRepository<Exercice, Long>{

    // Trouver tous les exercices d’un enseignant
    //List<Exercice> findByEnseignantId(Long enseignantId);

    // Trouver les exercices attribués à un élève précis
    //List<Exercice> findByEleveId(Long eleveId);

    // Trouver les exercices attribués à une classe
    List<Exercice> findByNiveau(String niveau);


}
