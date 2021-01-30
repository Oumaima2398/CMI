package com.exemple.Controllers;

import com.exemple.Entities.Facture;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Rep.CMIRepository;
import com.exemple.Services.CMIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CMI")
public class CMIController {
    CMIService cmiService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return cmiService.findById(id);
    }
    @RequestMapping(value = "/VerifierSolde", method = RequestMethod.POST)
    public void VerifierSolde(@PathVariable double solde){
        if(cmiService.verifySolde(solde)==false){
            System.out.println("Solde inssufisant");
        }
    }
    @RequestMapping(value = "/VerifierPermission", method = RequestMethod.POST)
    public void VerifierPermission(@PathVariable User user){
        if(cmiService.verifyBlackList(user)==false){
            System.out.println("Le compte de paiement ne peut pas etre crée");
        }
    }

    @RequestMapping(value = "/VerifierPayes", method = RequestMethod.POST)
    public void VerifierPayees(@PathVariable Facture f){
        if(cmiService.verifyPayee(f.getIdf())==true){
            System.out.println("Cette facture est dèjà payée");
        }
    }


}
