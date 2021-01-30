package com.exemple.Rep;

import com.exemple.Entities.Facture;
import com.exemple.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CMIRepository extends JpaRepository<User,Long>, PagingAndSortingRepository<User, Long> {

    @Query(value = "select tel from Blacklist", nativeQuery = true)
    static List<String> BlackList() { return null; }

    @Query(value = "select * from ListeFactures where id_facture=idf and paye=true", nativeQuery = true)
    static List<Facture> DejaPayes() { return null; }

    @Query(value = "select solde from Compte where compte_id=idc", nativeQuery = true)
    static double getsolde() {
        return 0;
    }

}

