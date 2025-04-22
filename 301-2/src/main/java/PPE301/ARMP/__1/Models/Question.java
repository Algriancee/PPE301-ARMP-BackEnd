package PPE301.ARMP.__1.Models;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor   @Getter @Setter @ToString @Builder

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enonce;

    //@ElementCollection
    //private List<String> choix;
    //private String bonneReponse;
    private String explication;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;

}
