package br.com.lucasjoly.authservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.lucasjoly.authservice.model.AppEntity;
import br.com.lucasjoly.authservice.repository.AppRepository;

@Service
public class AppService {

    public final AppRepository appRepository;

    public AppService(AppRepository appRepository){
        this.appRepository = appRepository;
    }

    public List<AppEntity> listEntity() {
        return appRepository.findAll();
    }

    public Optional<AppEntity> findEntity(Long id){
        return appRepository.findById(id);
    }

    public AppEntity saveEntity(AppEntity appEntity){
        return appRepository.save(appEntity);
    }

    public void deleteEntity(Long id){
        appRepository.deleteById(id);
    }
}
