package com.exemple.Entities;

import com.exemple.Rep.CMIRepository;

public class VerifierSolde {
    private boolean i;

    public void verifySolde(double solde) {
        if(CMIRepository.getsolde() > solde ){
            i = true;
        }
        else{
            i = false;
        }
    }
}
