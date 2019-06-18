package com.petcommunity.petcommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @program: petproject
 * @description: ${description}
 * @author: Mr.feiji
 * @create: 2019-06-16 22:11
 **/
public class CommonCotroller {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/common")
    public String common() {
        return "common";
    }
    @GetMapping("commonUseAdmin")
    public String commonUseAdmin() {
        return "common use" + this.restTemplate.getForObject("http://localhost:8080/admin", String.class);
    }

}
