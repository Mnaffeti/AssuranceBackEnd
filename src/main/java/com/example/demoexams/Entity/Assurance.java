package com.example.demoexams.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssurance;
    private String designiation;
    private float montant ;
    @ManyToOne
    @JoinColumn(name = "benificaire_id")
    Benificiaire benificiaire;
    @ManyToOne
    @JoinColumn(name="contrat_id")
    Contrat contrat;
}
