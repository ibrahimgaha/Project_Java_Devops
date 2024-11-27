package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Angence;
import com.example.demo.repositories.IAgenceRepository;

@Service
public class AngenceServiceImpl implements IAgenceService {
@Autowired
private IAgenceRepository repoA;
	
	@Override
	public Angence addAgence(Angence a) {
		// TODO Auto-generated method stub
		return repoA.save(a);
	}

}
