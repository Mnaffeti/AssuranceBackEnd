package com.example.demoexams.Service;

import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Entity.Contrat;
import com.example.demoexams.Repo.ContratRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@Service
@AllArgsConstructor
public class ContratService implements IContractService {

    ContratRepo contratRepo ;
    @Override
    public Contrat ajouterContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public Contrat getContratBf(int idBf) {

        return contratRepo.getContractByBeneficiaireIdOrderByDateAsc(idBf).stream().findFirst().get();
    }
}
