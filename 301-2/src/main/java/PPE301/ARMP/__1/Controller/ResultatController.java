package PPE301.ARMP.__1.Controller;


import PPE301.ARMP.__1.Models.Resultat;
import PPE301.ARMP.__1.Services.ResultatService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/resultats")
public class ResultatController {

    private final ResultatService resultatService;

    public ResultatController(ResultatService resultatService) {
        this.resultatService = resultatService;
    }

    //@GetMapping("/eleve/{eleveId}")
    //public List<Resultat> getResultatsByEleve(@PathVariable Long eleveId) {
        //return resultatService.getResultatsByEleve(eleveId);
    //}

    @GetMapping("/exercice/{exerciceId}")
    public List<Resultat> getResultatsByExercice(@PathVariable Long exerciceId) {
        return resultatService.getResultatsByExercice(exerciceId);
    }

    @PostMapping
    public Resultat addResultat(@RequestBody Resultat resultat) {
        return resultatService.addResultat(resultat);
    }

    @GetMapping
    public List<Resultat> getAllResultats() {
        return resultatService.getAllResultats();
    }
    @GetMapping("/{id}")
    public Resultat getResultatById(@PathVariable Long id) {
        return resultatService.getResultatById(id);
    }
    @PutMapping("/{id}")
    public Resultat updateResultat(@PathVariable Long id, @RequestBody Resultat resultat) {
        return resultatService.updateResultat(id, resultat);
    }
    @DeleteMapping("/{id}")
    public void deleteResultat(@PathVariable Long id) {
        resultatService.deleteResultat(id);
    }
}
