package PPE301.ARMP.__1.Controller;

import PPE301.ARMP.__1.Models.Correction;
import PPE301.ARMP.__1.Services.CorrectionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/corrections")

public class CorrectionController {

    private final CorrectionService correctionService;

    public CorrectionController(CorrectionService correctionService) {
        this.correctionService = correctionService;
    }

    @GetMapping("/eleve/{eleveId}")
    public List<Correction> getCorrectionsByEleve(@PathVariable Long eleveId) {
        return correctionService.getCorrectionsByEleve(eleveId);
    }
}

