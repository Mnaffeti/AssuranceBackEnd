package com.example.demoexams.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Benificiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idBenficiaire;
    String nom;
    int cin ;
    String prenom ;
    String profession ;
    float salaire ;
    @JsonIgnore
    @OneToMany(mappedBy = "benificiaire")
    List<Assurance> assuranceList ;

}
