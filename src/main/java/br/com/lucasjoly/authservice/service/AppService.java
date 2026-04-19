package br.com.lucasjoly.authservice.service;

import org.springframework.stereotype.Service;

import br.com.lucasjoly.authservice.repository.AppRepository;

@Service
public class AppService {

    private final AppRepository appRepository;

    public AppService(AppRepository appRepository){
        this.appRepository = appRepository;

    }

    public String obterMensagem(){
        return appRepository.obterMensagem();
    }

}
