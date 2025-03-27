package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Exercice;
import PPE301.ARMP.__1.Repository.ExerciceRepository;
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
        return exerciceRepository.save(exercice);
    }
}
