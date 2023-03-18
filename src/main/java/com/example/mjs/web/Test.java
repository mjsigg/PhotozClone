package com.example.mjs.web;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class Test {

    @GetMapping("/test")
    public String test() {
        return "Yup testing";
    }

//    @GetMapping("/ipapi")
//    public String ipAPI() {
//        String uri = "http://ip-api.com/json/)";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri,String.class);
//        return result;
//    }
    @JsonIgnoreProperties
    @GetMapping("/testing")
    public List<Object> getAPI() {
        String url = "http://ip-api.com/json/)";
        RestTemplate restTemplate = new RestTemplate();

        String[] response = restTemplate.getForObject(url, String[].class);

        return Arrays.asList(response);
    }

}
