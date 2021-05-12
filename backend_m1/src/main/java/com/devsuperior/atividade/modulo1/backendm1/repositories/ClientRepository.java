package com.devsuperior.atividade.modulo1.backendm1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.atividade.modulo1.backendm1.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
