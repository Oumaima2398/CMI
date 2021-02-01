package com.exemple.Services;

import com.exemple.Entities.User;
import com.exemple.Rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public Boolean isClientBlacklisted(User user){
        return  userRepository.isBlacklisted(user.getPhone());

    }
}
