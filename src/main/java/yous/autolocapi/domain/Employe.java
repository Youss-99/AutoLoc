package yous.autolocapi.domain;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor


public class Employe {
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    @Id
    private Long idEmploye;
    private String nom;
    private String prenom;
    private String rome;
    @Enumerated(EnumType.STRING)
    private RoleEmploye Role;

}
