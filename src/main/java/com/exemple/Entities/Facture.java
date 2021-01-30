package com.exemple.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Table(name = "facture")
public class Facture {
    @Id
    @GeneratedValue
    private int idf;
    @Column(name = "paye")
    private boolean paye;

    public List<Facture> ListeFactures;

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public boolean isPaye() {
        return paye;
    }

    public List<Facture> getListeFactures() {
        return ListeFactures;
    }

    public void setListeFactures(List<Facture> listeFactures) {
        ListeFactures = listeFactures;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    public Facture(int idf, boolean paye, List<Facture> listeFactures) {
        this.idf = idf;
        this.paye = paye;
        this.ListeFactures = listeFactures;
    }
}
