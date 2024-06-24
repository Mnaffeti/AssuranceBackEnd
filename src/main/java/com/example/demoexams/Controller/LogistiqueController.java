package com.example.demoexams.Controller;

import com.example.demoexams.Entity.Logistique;
import com.example.demoexams.Entity.Participant;
import com.example.demoexams.Service.ILogistiqueService;
import com.example.demoexams.Service.IParticipService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class LogistiqueController {
    ILogistiqueService logistiqueService;
    @PostMapping(path = "/logistique")
    public Logistique addLogistiqueAffectEvent(@RequestBody Logistique l , @RequestParam String descriptionEvnmt) {
        return logistiqueService.ajoutAffectLogEvnm(l,descriptionEvnmt);
    }
    @GetMapping(path = "/logistic-inbetween")
    public List<Logistique>getLogistiquesBetween(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date deb,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fin) {
        return logistiqueService.getLogistiquesDates(deb,fin);

    }
}
