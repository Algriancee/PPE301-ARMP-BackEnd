package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Resultat;
import PPE301.ARMP.__1.Repository.ResultatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultatService {

    private final ResultatRepository resultatRepository;

    public ResultatService(ResultatRepository resultatRepository) {

        this.resultatRepository = resultatRepository;
    }

    //public List<Resultat> getResultatsByEleve(Long eleveId) {

    //return resultatRepository.findByEleveId(eleveId);
    //}

    public List<Resultat> getResultatsByExercice(Long exerciceId) {
            return resultatRepository.findByExerciceId(exerciceId);
    }

    public List<Resultat> getAllResultats() {
        return resultatRepository.findAll();
    }

    public Resultat getResultatById(Long id) {
        return resultatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Résultat non trouvé"));
    }

    public Resultat addResultat(Resultat resultat) {
        return resultatRepository.save(resultat);
    }

    public Resultat updateResultat(Long id, Resultat updatedResultat) {
        Resultat existingResultat = resultatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Résultat non trouvé avec l'id : " + id));

        // Met à jour les champs nécessaires
        existingResultat.setNiveau(updatedResultat.getNiveau());
        existingResultat.setExercice(updatedResultat.getExercice());
        existingResultat.setCorrections(updatedResultat.getCorrections());
        //existingResultat.setBonneReponse(updatedResultat.getBonneReponse());
        //existingResultat.setExplication(updatedResultat.getExplication());

        // ajoute d’autres champs si besoin

        return resultatRepository.save(existingResultat);
    }

    public void deleteResultat(Long id) {
        if (!resultatRepository.existsById(id)) {
            throw new RuntimeException("Résultat non trouvé avec l'id : " + id);
        }
        resultatRepository.deleteById(id);
    }


}
