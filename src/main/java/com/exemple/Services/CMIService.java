package com.exemple.Services;

import com.exemple.Entities.Facture;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Rep.CMIRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CMIService {

    @Autowired
    private CMIRepository CMIRepo ;


    public User findById(int id) {
        return CMIRepo.findById((long) id).get();
    }

    public boolean verifySolde(double solde) {
        if(CMIRepository.getsolde() > solde ){
            Payement p = new Payement();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verifyBlackList(User user) {
        if(CMIRepository.BlackList().contains(user.telephone) ){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean verifyPayee(int idf) {

        if(CMIRepository.DejaPayes().contains(idf) ){
            return true;
        }
        else{
            return false;
        }
    }

}
