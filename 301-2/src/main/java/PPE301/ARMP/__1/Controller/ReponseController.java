package PPE301.ARMP.__1.Controller;


import PPE301.ARMP.__1.Models.Reponse;
import PPE301.ARMP.__1.Services.ReponseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reponses")

public class ReponseController {

    private final ReponseService reponseService;

    public ReponseController(ReponseService reponseService) {
        this.reponseService = reponseService;
    }

    @GetMapping("/eleve/{eleveId}")
    public List<Reponse> getReponsesByEleve(@PathVariable Long eleveId) {
        return reponseService.getReponsesByEleve(eleveId);
    }
}
