package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Exercice;
import PPE301.ARMP.__1.Repository.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExerciceService {

    private final ExerciceRepository exerciceRepository;


    public ExerciceService(ExerciceRepository exerciceRepository) {
        this.exerciceRepository = exerciceRepository;
    }

    public List<Exercice> getExercicesByEnseignant(Long enseignantId) {
        return exerciceRepository.findByEnseignantId(enseignantId);
    }

    public Exercice createExercice(Exercice exercice) {
        // Associer l'exercice à chaque question
        if (exercice.getQuestions() != null) {
            exercice.getQuestions().forEach(question -> question.setExercice(exercice));
        }

        // Sauvegarder l'exercice et ses questions
        return exerciceRepository.save(exercice);
    }



    public List<Exercice> getAllExercices() {
        return exerciceRepository.findAll();
    }
}
