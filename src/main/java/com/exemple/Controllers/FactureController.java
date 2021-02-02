package com.exemple.Controllers;

import com.exemple.Entities.Facture;
import com.exemple.Entities.User;
import com.exemple.Services.FactureService;
import com.exemple.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class FactureController {

    @Autowired
    FactureService factureService;
    @RequestMapping(value="/cmi/isPaye",method= RequestMethod.POST)
    public Boolean isPaye(@RequestBody Facture facture) {
        return  factureService.isPaye(facture);
    }
}
