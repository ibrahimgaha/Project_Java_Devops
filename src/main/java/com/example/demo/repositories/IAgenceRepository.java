package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Angence;
@Repository
public interface IAgenceRepository extends CrudRepository<Angence, Integer> {

}
