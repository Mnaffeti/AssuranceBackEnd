package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Assurance;
import com.example.demoexams.Entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssuranceRepo extends JpaRepository<Assurance, Integer> {


}
