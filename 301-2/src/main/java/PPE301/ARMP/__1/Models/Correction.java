package PPE301.ARMP.__1.Models;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Correction {


    private String bonneReponse;
    private String explication;





}
