package com.exemple.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Blacklist")
public class BlackList {
    @Id
    @GeneratedValue
    private int idUser;

    @Column(name = "nom")
    public String nom;

    @Column(name = "telephone")
    public String telephone;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BlackList() {
    }
}
