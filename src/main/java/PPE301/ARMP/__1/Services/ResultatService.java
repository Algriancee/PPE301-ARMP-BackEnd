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

    public List<Resultat> getResultatsByEleve(Long eleveId) {
        return resultatRepository.findByEleveId(eleveId);
    }
}
