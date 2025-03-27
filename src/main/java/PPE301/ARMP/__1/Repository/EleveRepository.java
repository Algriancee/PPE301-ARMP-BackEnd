package PPE301.ARMP.__1.Repository;

import PPE301.ARMP.__1.Models.Correction;
import PPE301.ARMP.__1.Models.Exercice;
import PPE301.ARMP.__1.Models.Resultat;
import PPE301.ARMP.__1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EleveRepository extends JpaRepository<User, Long> {

    List<User> findByParentId(Long parentId);
    List<User> findByClasse(String classe);
    List<Exercice> findExercicesByNiveau(String niveau);
    List<Resultat> findResultatsByEleveId(Long eleveId);
    List<Correction> findCorrectionsByEleveId(Long eleveId);


}
