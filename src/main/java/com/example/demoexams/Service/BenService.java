package com.example.demoexams.Service;

import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Repo.BenRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BenService implements IBenService {
    BenRepo benRepo;
    @Override
    public Benificiaire ajouterBeneficiaire(Benificiaire bf) {
        return benRepo.save(bf);
    }
}
