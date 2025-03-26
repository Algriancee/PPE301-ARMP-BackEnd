package PPE301.ARMP.__1.Models;


import jakarta.persistence.Embeddable;

@Embeddable
public class Correction {

    private Long questionId;
    private String bonneReponse;
    private String explication;

}
