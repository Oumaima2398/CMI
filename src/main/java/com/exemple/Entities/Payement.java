package com.exemple.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "payement")
public class Payement {
    @Id
    @GeneratedValue
    private int idp;

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public Payement() {}
}
