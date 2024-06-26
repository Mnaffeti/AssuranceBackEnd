package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Entity.Contrat;
import com.example.demoexams.Service.IBenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class BenController {
    IBenService benService;

    @PostMapping(path = "/ben")
    public Benificiaire ajoutEvent(@RequestBody Benificiaire e) {
        return benService.ajouterBeneficiaire(e);
    }
}