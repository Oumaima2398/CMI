package com.exemple.Entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idUser;

    public User() {
    }

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "phone")
    private String phone;

    @Column(name = "isBlacklisted")
    private Boolean isBlacklisted;


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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telephone) {
        this.phone = telephone;
    }

    public User(int idUser,String nom,String prenom,String telephone) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = telephone;
    }
}
