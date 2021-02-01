package com.exemple.Controllers;

import com.exemple.Entities.Compte;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Services.CompteService;
import com.exemple.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CompteController {
    @Autowired
    CompteService compteService;
    @RequestMapping(value="/cmi/haveSolde",method= RequestMethod.GET)
    public Boolean haveSolde(@RequestBody Compte compte,@RequestBody Payement payement) {
          if(compteService.solde(compte) > payement.getPrix()){
              Payement p = new Payement();
              return true;
          }
          else return false;
    }
}
