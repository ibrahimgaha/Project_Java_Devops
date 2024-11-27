package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Client;
import com.example.demo.entities.Compte;
import com.example.demo.repositories.IClientRepository;
import com.example.demo.repositories.ICompteRepository;

@Service
public class CompteServiceImpl implements ICompteService {
	@Autowired
	private ICompteRepository repoCp;
	
	@Autowired
	private IClientRepository repoClient;
	
	@Override
	public Compte addCompte(Compte c) {
		// TODO Auto-generated method stub
		return repoCp.save(c) ;
	}

	@Override
	public Compte assignClientCompte(int idClient, int idCompte) {
		Compte compte = repoCp.findById(idCompte).get();
		Client client = repoClient.findById(idClient).get();
		compte.setClient(client);
		return repoCp.save(compte);
	}

	@Override
	public Compte addAndAssign(Compte cp, int idClient) {
		 Client client = repoClient.findById(idClient).get();
		 cp.setClient(client);
		return repoCp.save(cp);
	}

	

}
