package com.exemple.Rep;

import com.exemple.Entities.Compte;
import com.exemple.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompteRepository extends JpaRepository<Compte,Integer> {

    @Query(value = "select solde from Compte where  idco=:idco", nativeQuery = true)
    public double getsolde(int idco);
    @Query(value = "select prix from Payement where  idp=:idp", nativeQuery = true)
    public double getprix(int idp);

}
