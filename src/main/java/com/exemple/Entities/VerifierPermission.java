package com.exemple.Entities;

import com.exemple.Rep.CMIRepository;

public class VerifierPermission {
    private Boolean permission;
    private User user;


    public void verifyBlackList() {
        if(CMIRepository.BlackList().contains(user.telephone) ){
            permission = false;
        }
        else{
            permission = true;
        }
    }
}
