package com.example.demo.services;

import com.example.demo.entities.Compte;

public interface ICompteService {
	public Compte addCompte(Compte c);
	public Compte assignClientCompte(int idClient, int idCompte);
	public Compte addAndAssign(Compte cp, int idClient);
}
