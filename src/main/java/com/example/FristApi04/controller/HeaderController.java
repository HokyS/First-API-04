package com.example.FristApi04.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/headers")
public class HeaderController {


    @GetMapping(value = "")
    public String hostname(@RequestHeader (HttpHeaders.HOST) String port, @RequestHeader (HttpHeaders.USER_AGENT)String d4btw){
        return "Host Name : " + d4btw + " " + "Port : " + port;
    }
}
