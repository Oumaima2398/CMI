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

    public List<Facture> DejaPayes;
}
