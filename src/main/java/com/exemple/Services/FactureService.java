package com.exemple.Services;

import com.exemple.Entities.Facture;
import com.exemple.Entities.User;
import com.exemple.Rep.FactureRepository;
import com.exemple.Rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureService {
    @Autowired
    FactureRepository factureRepository;


    public Boolean isPaye(Facture facture){
        return  factureRepository.DejaPayes(facture.getIdf());

    }
}
