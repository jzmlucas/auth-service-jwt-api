package br.com.lucasjoly.authservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasjoly.authservice.model.AppEntity;
import br.com.lucasjoly.authservice.service.AppService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/v1")
public class AppController {

    private final AppService appService;    
    
    public AppController(AppService appService){
        this.appService = appService;
    }

    @GetMapping
    public List<AppEntity> listEntity() {
        return appService.listEntity();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppEntity> findEntity(@PathVariable Long id) {
        return appService.findEntity(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AppEntity saveEntity(@RequestBody AppEntity appEntity) {
        return appService.saveEntity(appEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        appService.deleteEntity(id);
        return ResponseEntity.noContent().build();
    }

}
