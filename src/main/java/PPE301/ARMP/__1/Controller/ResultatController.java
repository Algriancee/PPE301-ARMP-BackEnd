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

    @GetMapping("/eleve/{eleveId}")
    public List<Resultat> getResultatsByEleve(@PathVariable Long eleveId) {
        return resultatService.getResultatsByEleve(eleveId);
    }
}
