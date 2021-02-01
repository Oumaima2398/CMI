package com.exemple.Controllers;

import com.exemple.Entities.User;
import com.exemple.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class UserController {


    @Autowired
    UserService userService;
    @RequestMapping(value="/cmi/isInBlackList",method= RequestMethod.GET)
    public Boolean getBlackList(@RequestBody User user) {
        return  userService.isClientBlacklisted(user);
    }


}
