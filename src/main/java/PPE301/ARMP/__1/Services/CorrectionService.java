package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Correction;
import PPE301.ARMP.__1.Repository.CorrectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CorrectionService {

    private final CorrectionRepository correctionRepository;

    public CorrectionService(CorrectionRepository correctionRepository) {
        this.correctionRepository = correctionRepository;
    }

    public List<Correction> getCorrectionsByEleve(Long eleveId) {
        return correctionRepository.findByEleveId(eleveId);
    }
}
