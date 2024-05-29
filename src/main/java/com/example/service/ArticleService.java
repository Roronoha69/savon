package com.example.service;

import org.springframework.stereotype.Service;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "ArticleService")
@Service
public class ArticleService {

    @WebMethod
    public String direBonjour(String nom) {
        return "Bonjour, " + nom + "!";
    }

    // Autres
}
