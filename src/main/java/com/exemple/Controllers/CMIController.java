package com.exemple.Controllers;

import com.exemple.Entities.Facture;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Rep.CMIRepository;
import com.exemple.Services.CMIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CMIController {
    CMIRepository rep;
    CMIService cmiService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return cmiService.findById(id);
    }
    @PostMapping
    public void VerifierSolde(@PathVariable double solde){
        if(cmiService.verifySolde(solde)==false){
            System.out.println("Solde inssufisant");
        }
    }
    @PostMapping
    public void VerifierPermission(@PathVariable User user){
        if(cmiService.verifyBlackList(user)==false){
            System.out.println("Le compte de paiement ne peut pas etre crée");
        }
    }

    @PostMapping
    public void VerifierPayees(@PathVariable Facture f){
        if(cmiService.verifyPayee(f.getIdf())==true){
            System.out.println("Cette facture est dèjà payée");
        }
    }


}
