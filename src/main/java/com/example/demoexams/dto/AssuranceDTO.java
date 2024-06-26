package com.example.demoexams.dto;

import com.example.demoexams.Entity.Assurance;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssuranceDTO {
    Assurance assurance = new Assurance();
    int cin ;
    String matricule ;

}
