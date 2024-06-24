package com.example.demoexams.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name ;
    String surname;
    @Enumerated(EnumType.STRING)
    Tache tache ;
    @ManyToMany(mappedBy = "participantList")
    @JsonIgnore
    List<Event> events ;

}
