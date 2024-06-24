package com.example.demoexams.Service;

import com.example.demoexams.Entity.Event;
import com.example.demoexams.Entity.Logistique;
import com.example.demoexams.Repo.EventRepo;
import com.example.demoexams.Repo.IlogistiqueRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor

public class ILogisitiqueServiceImp implements ILogistiqueService{
    IlogistiqueRepo logRepo ;
    EventRepo eventRepo;
    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt) {
            Logistique luta =logRepo.save(l);
            Event e =eventRepo.findByDescription(descriptionEvnmt).orElse(null);
            List<Logistique> tmpList=new ArrayList<>();
            tmpList.add(l);
            if(e.getLogs().isEmpty())
            {
                e.setLogs(tmpList);
            }
            else{
                e.getLogs().add(l);
            }
            eventRepo.save(e);




        return  luta;
    }

    @Override
    public List<Logistique> getLogistiquesDates(Date dateDeb, Date dateFin) {
        List<Event> tmp_list= eventRepo.findEventsByDateDebutAfterAndDateFinBefore(dateDeb, dateFin);
        return tmp_list.stream().map(Event::getLogs).flatMap(List::stream).toList();
    }
}
