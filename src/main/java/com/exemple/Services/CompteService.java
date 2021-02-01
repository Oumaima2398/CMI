package com.exemple.Services;

import com.exemple.Entities.Compte;
import com.exemple.Entities.User;
import com.exemple.Rep.CompteRepository;
import com.exemple.Rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository;


    public double solde(Compte compte){
        return  compteRepository.getsolde(compte.getIdco());

    }
}
