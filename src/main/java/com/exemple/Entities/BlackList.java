package com.exemple.Entities;

import javax.persistence.*;

@Table(name="Blacklist")
@Entity
public class BlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
