package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ContratRepo extends JpaRepository<Contrat, Integer> {

    Optional<Contrat> findByMatricule(String matricule);

    @Query("SELECT l FROM Contrat l WHERE l.idContrat IN (SELECT a.contrat.idContrat FROM Assurance a WHERE a.benificiaire.idBenficiaire = :id) ORDER BY l.dateContrat ASC")
    List<Contrat> getContractByBeneficiaireIdOrderByDateAsc(@Param("id") int id);

}
