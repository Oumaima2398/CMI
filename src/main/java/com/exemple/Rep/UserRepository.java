package com.exemple.Rep;

import com.exemple.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select isBlacklisted from User where  phone=:phone", nativeQuery = true)
    public Boolean isBlacklisted(String phone);
}
