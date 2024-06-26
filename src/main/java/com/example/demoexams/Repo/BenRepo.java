package com.example.demoexams.Repo;

import com.example.demoexams.Entity.Benificiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BenRepo extends JpaRepository<Benificiaire,Long> {
    Optional<Benificiaire> findByCin(int cin);


}
