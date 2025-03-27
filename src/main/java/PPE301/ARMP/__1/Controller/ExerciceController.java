package PPE301.ARMP.__1.Controller;

import PPE301.ARMP.__1.Models.Exercice;
import PPE301.ARMP.__1.Services.ExerciceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;


import java.util.List;




@RestController
@RequestMapping("/exercices")
public class ExerciceController {

    private final ExerciceService exerciceService;

    public ExerciceController(ExerciceService exerciceService) {
        this.exerciceService = exerciceService;
    }

    @GetMapping("/enseignant/{enseignantId}")
    public List<Exercice> getExercicesByEnseignant(@PathVariable Long enseignantId) {
        return exerciceService.getExercicesByEnseignant(enseignantId);
    }

    @PostMapping
    public Exercice createExercice(@RequestBody Exercice exercice) {
        return exerciceService.createExercice(exercice);
    }
}
