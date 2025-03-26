package PPE301.ARMP.__1.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor   @Getter
@Setter
@ToString @Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    private String nom;
    private String prenom;
    private String email;
    private String password;

    @OneToMany(mappedBy = "eleve")
    private List<Resultat> resultats;

    @OneToMany(mappedBy = "eleve")
    private List<Reponse> reponses;

    @OneToMany(mappedBy = "enseignant")
    private List<Exercice> exercices;
}
