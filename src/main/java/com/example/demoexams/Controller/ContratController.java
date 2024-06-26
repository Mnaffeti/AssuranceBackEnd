package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Benificiaire;
import com.example.demoexams.Entity.Contrat;
import com.example.demoexams.Service.IBenService;
import com.example.demoexams.Service.IContractService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ContratController {
    IContractService contractService;

    @PostMapping(path = "/contrat")
    public Contrat ajoutContrat(@RequestBody Contrat c) {
        return contractService.ajouterContrat(c);
    }
    @GetMapping(path="/contract")
    public Contrat getContractbyId(@RequestParam int id) {
        return contractService.getContratBf(id) ;
    }
}
