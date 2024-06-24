package com.example.demoexams.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEvent;
    String description ;
    Date dateDebut;
    Date dateFin;
    float cout;
    @OneToMany
    List<Logistique> logs;
    @ManyToMany
    List<Participant> participantList;

}
