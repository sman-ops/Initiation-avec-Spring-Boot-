package edu.slimen.formation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@GetMapping(path="/allUtilisateur")
	public String getAllUsers() {
	 return "get all users";
	
	}

}
