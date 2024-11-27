package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Client;

@Repository
public interface IClientRepository extends CrudRepository<Client, Integer> {

}
