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

}
