package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParticipRepo extends JpaRepository<Participant,Long> {

   // Optional<Participant> findByNameAAndSurname(String nom,String surname);
    Optional<Participant> findById(Long id);

}
