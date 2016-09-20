package com.example.rest;

import com.example.domain.Toto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

    @RequestMapping("/toto")
    public Toto getToto(){
        Toto toto = new Toto();
        toto.setTata("Hello world !");
        return toto;
    }

}
