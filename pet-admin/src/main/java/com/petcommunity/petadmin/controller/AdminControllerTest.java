package com.petcommunity.petadmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: petproject
 * @description: ${description}
 * @author: Mr.feiji
 * @create: 2019-06-16 17:23
 **/
@RestController
public class AdminControllerTest {
    @RequestMapping ("/admin")
    public String admin() {
        return  "admin";
    }
}
