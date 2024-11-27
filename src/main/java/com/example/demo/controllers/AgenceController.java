package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Angence;
import com.example.demo.services.IAgenceService;

@RestController
@RequestMapping("/agence")
public class AgenceController { 
	
	@Autowired
	private IAgenceService serviceA;
	
	@PostMapping("/addAgence")
	public Angence addAgence(@RequestBody Angence a) {
		return serviceA.addAgence(a);
	}
}
