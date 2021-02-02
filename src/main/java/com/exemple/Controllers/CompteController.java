package com.exemple.Controllers;

import com.exemple.Entities.Compte;
import com.exemple.Entities.Payement;
import com.exemple.Services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class CompteController {
    @Autowired
    CompteService compteService;
    @RequestMapping(value="/cmi/haveSolde/{idp}",method= RequestMethod.POST)
    public Boolean haveSolde(@RequestBody Compte compte,@PathVariable("idp") int idp) {
          if(compteService.solde(compte) > compteService.prix(idp)){
              return true;
          }
          else return false;
    }
}
