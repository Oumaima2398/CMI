package com.exemple.Entities;

import javax.persistence.*;

@Table(name = "payement")
@Entity
public class Payement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idp;

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public Payement() {}
}
