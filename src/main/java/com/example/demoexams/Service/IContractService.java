package com.example.demoexams.Service;

import com.example.demoexams.Entity.Contrat;

public interface IContractService {
    public Contrat ajouterContrat (Contrat c);
    public Contrat getContratBf (int idBf);
}
