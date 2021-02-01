package com.exemple.Entities;

import javax.persistence.*;

@Table(name = "payement")
@Entity
public class Payement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idp;

    @Column(name="prix")
    private double prix;

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public Payement() {}
}
