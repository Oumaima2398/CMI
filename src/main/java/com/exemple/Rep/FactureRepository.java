package com.exemple.Rep;

import com.exemple.Entities.Facture;
import com.exemple.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Integer> {

    @Query(value = "select paye from facture where idf=:idf", nativeQuery = true)
    Boolean DejaPayes(int idf);
}
