package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {
    Optional<Event> findByDescription(String desc);
    //List<Event>finAllByDateBetween(Date start, Date end);


    List<Event> findEventsByDateDebutAfterAndDateFinBefore(Date dateDeb, Date dateFin);
}
