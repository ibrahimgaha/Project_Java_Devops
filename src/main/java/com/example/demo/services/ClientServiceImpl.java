package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.repositories.IClientRepository;
@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientRepository repoC;
	
	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return repoC.save(c);
	}

}
