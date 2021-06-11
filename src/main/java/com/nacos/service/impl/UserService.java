package com.nacos.service.impl;

import com.nacos.service.openfeign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Autowired
    private UserServiceFeign userServiceFeign;
    @GetMapping("/getUser")
    public String getUserInfo(){
        return "b===>>"+userServiceFeign.getUser("pengbiao");
    }
}
