package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Assurance;
import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Service.IAssuranceSer;
import com.example.demoexams.Service.IBenService;
import com.example.demoexams.dto.AssuranceDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class AssuranceController {
    IAssuranceSer assuranceSer;

    @PostMapping(path = "/assurance_affect")
    public Assurance ajoutAffectAssurance(@RequestBody AssuranceDTO ass) {
        return assuranceSer.ajouterAssurance(ass);
    }
}
