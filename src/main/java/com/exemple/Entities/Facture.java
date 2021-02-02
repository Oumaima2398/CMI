package com.exemple.Entities;

import javax.persistence.*;
import java.util.List;

@Table(name = "facture")
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idf;
    @Column(name = "paye")
    private boolean paye;

    public Facture() {

    }


    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public boolean isPaye() {
        return paye;
    }



    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    public Facture(int idf, boolean paye) {
        this.idf = idf;
        this.paye = paye;
    }
}
