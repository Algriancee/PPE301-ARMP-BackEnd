package PPE301.ARMP.__1.Services;

import PPE301.ARMP.__1.Models.Reponse;
import PPE301.ARMP.__1.Repository.ReponseRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReponseService {

    private final ReponseRepository reponseRepository;

    public ReponseService(ReponseRepository reponseRepository) {
        this.reponseRepository = reponseRepository;
    }

    public List<Reponse> getReponsesByEleve(Long eleveId) {
        return reponseRepository.findByEleveId(eleveId);
    }
}
