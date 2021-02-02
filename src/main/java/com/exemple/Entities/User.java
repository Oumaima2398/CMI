package com.exemple.Entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_user;

    public User() {
    }

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_blacklisted")
    private Boolean is_blacklisted;


    public int getIdUser() {
        return id_user;
    }

    public void setIdUser(int id_user) {
        this.id_user = id_user;
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

    public Boolean getIs_blacklisted() {
        return is_blacklisted;
    }

    public void setIs_blacklisted(Boolean is_blacklisted) {
        this.is_blacklisted = is_blacklisted;
    }

    public User(int id_user, String nom, String prenom, String telephone,Boolean is_blacklisted) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.phone = telephone;
        this.is_blacklisted = is_blacklisted;
    }
}
