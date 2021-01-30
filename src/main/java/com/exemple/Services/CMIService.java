package com.exemple.Services;

import com.exemple.Entities.Facture;
import com.exemple.Entities.Payement;
import com.exemple.Entities.User;
import com.exemple.Rep.CMIRepository;

public class CMIService {
    public boolean paye;
    private Boolean permission;
    private User user;
    private boolean i;

    public void verifySolde(double solde) {
        if(CMIRepository.getsolde() > solde ){
            i = true;
            Payement p = new Payement();
        }
        else{
            i = false;
        }
    }

    public void verifyBlackList() {
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
