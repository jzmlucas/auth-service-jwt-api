package br.com.lucasjoly.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasjoly.authservice.service.AppService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class AppController {

    private final AppService appService;

    public AppController(AppService appService){
        this.appService = appService;

    }

    @GetMapping("/msg")
    public String msg() {
        return appService.obterMensagem();
    }

}
