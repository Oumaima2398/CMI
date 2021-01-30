package com.exemple.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int idUser;

    @Column(name = "telephone")
    public String telephone;
}
