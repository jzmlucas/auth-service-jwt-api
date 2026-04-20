package br.com.lucasjoly.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucasjoly.authservice.model.AppEntity;

@Repository
public interface AppRepository extends JpaRepository<AppEntity, Long> {

}
