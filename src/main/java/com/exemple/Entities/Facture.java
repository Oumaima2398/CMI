package com.exemple.Entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class Facture {
    @Id
    @GeneratedValue
    private int idf;
    @Column(name = "paye")
    private boolean paye;

    public List<Facture> DejaPayes;
}
