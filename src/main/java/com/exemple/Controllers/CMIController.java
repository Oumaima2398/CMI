package com.exemple.Controllers;

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
    /*@PostMapping
    public void addPayement(Payement p) {
        cmiService.create(p);
    }*/
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return cmiService.findById(id);
    }


}
