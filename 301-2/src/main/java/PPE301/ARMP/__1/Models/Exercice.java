package PPE301.ARMP.__1.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String niveau;

    @OneToMany(mappedBy = "exercice", cascade = CascadeType.ALL)
    private List<Question> questions;

    //@ManyToOne
    //@JoinColumn(name = "enseignant_id")
    //private User enseignant;

    //@ManyToOne
    //@JoinColumn(name = "eleve_id")
    //private User eleve;

    


}
