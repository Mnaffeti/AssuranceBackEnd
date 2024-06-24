package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface IlogistiqueRepo extends JpaRepository<Logistique, Long> {
    //@Query("SELECT l FROM Logistique l WHERE l.idLog IN (SELECT e.idEvent FROM Event e WHERE e.dateDebut <= :dateDeb AND e.dateFin >= :dateFin)")
    ////List<Logistique> findLogistiquesBetweenDates(@Param("dateDeb") Date dateDeb, @Param("dateFin") Date dateFin);


}
