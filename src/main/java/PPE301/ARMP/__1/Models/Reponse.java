package PPE301.ARMP.__1.Models;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor    @Getter @Setter @ToString @Builder
public class Reponse {

    @Setter
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exercice_id")
    private Exercice exercice;

    @ManyToOne
    @JoinColumn(name = "eleve_id")
    private User eleve;

    @ElementCollection
    private List<ReponseDetail> reponses;

    public Long getId() {
        return id;
    }
}
