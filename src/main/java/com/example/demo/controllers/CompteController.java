package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Compte;
import com.example.demo.services.ICompteService;

@RestController
@RequestMapping("/compte")
public class CompteController {
	@Autowired
	private ICompteService compteService;
	
	@PostMapping("/addCompte")
	public Compte addCompte(@RequestBody Compte c) {
		return compteService.addCompte(c);
	}
	
	@PutMapping("/assignCC/{idClient}/{idCompte}")
	public Compte assignCC( @PathVariable("idClient")int idClient, @PathVariable("idCompte")int idCompte ) {
		return compteService.assignClientCompte(idClient, idCompte);
	}
	
	
	@PostMapping("/add-and-assign/{idClient}")
    public Compte addAndAssignCompte(@RequestBody Compte compte, @PathVariable("idClient") int idClient) {
        Compte result = compteService.addAndAssign(compte, idClient);
        return result;
    }
}
