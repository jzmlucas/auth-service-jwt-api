package br.com.lucasjoly.authservice.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

    public String obterMensagem(){
        return "AppRepository test message";
    }

}
