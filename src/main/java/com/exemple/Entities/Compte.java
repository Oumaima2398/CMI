package com.exemple.Entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "compte")
public class Compte {
    @Id @GeneratedValue
    private int idco;
    @Id @GeneratedValue
    private int idcl;
    @Column(name = "solde")
    private double solde;

    public double getSolde() {
        return solde;
    }

    public void setIdco(int idco) {
        this.idco = idco;
    }

    public int getIdcl() {
        return idcl;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setIdcl(int idcl) {
        this.idcl = idcl;
    }

    public int getIdco() {
        return idco;
    }

    @Autowired
    public Compte(int idco,int idcl,double sol) {
        this.idco = idco;
        this.idcl = idcl;
        this.solde = sol;
    }
}
