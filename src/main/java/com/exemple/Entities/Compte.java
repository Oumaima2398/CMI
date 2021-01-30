package com.exemple.Entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "compte")
public class Compte {
    @Id @GeneratedValue
    private int idc;
    @Column(name = "solde")
    private double solde;

    @Autowired
    public Compte(int idc,double sol) {
        this.idc = idc;
        this.solde = sol;
    }
}
