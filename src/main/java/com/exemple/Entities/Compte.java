package com.exemple.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Compte {
    @Id @GeneratedValue
    private int idc;
    @Column(name = "solde")
    private double solde;
}
