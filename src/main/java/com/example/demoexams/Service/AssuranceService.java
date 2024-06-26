package com.example.demoexams.Service;

import com.example.demoexams.Entity.Assurance;
import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Entity.Contrat;
import com.example.demoexams.Repo.AssuranceRepo;
import com.example.demoexams.Repo.BenRepo;
import com.example.demoexams.Repo.ContratRepo;
import com.example.demoexams.dto.AssuranceDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.io.Serializable;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AssuranceService implements IAssuranceSer {
    AssuranceRepo assuranceRepo;
    BenRepo benRepository;
    ContratRepo contratRepository;
    @Override
    public Assurance ajouterAssurance(AssuranceDTO assurance) {
        Optional<Benificiaire> tmp_ben = benRepository.findByCin(assurance.getCin());
        if (tmp_ben.isPresent()) {
            assurance.getAssurance().setBenificiaire(tmp_ben.orElse(null));
        }
        Optional<Contrat> tmp_contrat=contratRepository.findByMatricule(assurance.getMatricule());
        if (tmp_contrat.isPresent()) {
            assurance.getAssurance().setContrat(tmp_contrat.orElse(null));
        }
        return assuranceRepo.save(assurance.getAssurance());



    }
}
