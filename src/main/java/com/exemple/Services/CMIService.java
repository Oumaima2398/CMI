package com.exemple.Services;

import com.exemple.Entities.Facture;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Rep.CMIRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CMIService {
    public boolean paye;
    private Boolean permission;
    private boolean i;
    @Autowired
    private CMIRepository CMIRepo ;

    /*public void create(Payement o) {
        CMIRepo.save(o);
    }*/

    public User findById(int id) {
        return CMIRepo.findById((long) id).get();
    }

    public void verifySolde(double solde) {
        if(CMIRepository.getsolde() > solde ){
            i = true;
            Payement p = new Payement();
        }
        else{
            i = false;
        }
    }

    public void verifyBlackList(User user) {
        if(CMIRepository.BlackList().contains(user.telephone) ){
            permission = false;
        }
        else{
            permission = true;
        }
    }
    public void verifyPayee(Facture idf) {

        if(CMIRepository.DejaPayes().contains(idf) ){
            paye = true;
        }
        else{
            paye = false;
        }
    }

}
