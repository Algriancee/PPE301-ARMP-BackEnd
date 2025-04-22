package PPE301.ARMP.__1.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString @Builder
@Table(name = "resultats")
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String niveau;
    //private String bonneReponse;
    //private String explication;


    //@ManyToOne
    //@JoinColumn(name = "eleve_id")
    //private User eleve;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;


    @ElementCollection
    private List<Correction> corrections = new ArrayList<>();
}
