package com.exemple.Entities;

import com.exemple.Rep.CMIRepository;

public class VerifierPayee {
    private Boolean paye;



    public void verifyPayee(Facture idf) {
        if(CMIRepository.DejaPayes().contains(idf) ){
            paye = true;
        }
        else{
            paye = false;
        }
    }
}