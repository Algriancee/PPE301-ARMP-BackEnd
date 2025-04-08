package PPE301.ARMP.__1.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString @Builder
public class Resultat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String niveau;

    @ManyToOne
    @JoinColumn(name = "eleve_id")
    private User eleve;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;

    private int score;
    private int totalQuestions;

    @ElementCollection
    private List<Correction> corrections;
}
