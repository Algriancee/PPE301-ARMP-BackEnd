package PPE301.ARMP.__1.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor   @Getter
@Setter
@ToString @Builder
public class Answer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "eleve_id")
    private User eleve;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;

    @Lob
    private String answerGiven;
    private boolean isCorrect;
    private int score;
    private java.util.Date date;
}
