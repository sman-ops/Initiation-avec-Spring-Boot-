package edu.slimen.formation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.slimen.formation.entities.Utilisateur;
import edu.slimen.formation.services.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService userService;
	
	@GetMapping()
	public List<Utilisateur> getAllUsers() {
	 return userService.getAllUSers();
	}
	@GetMapping(path="/{id}")
	public ResponseEntity<Utilisateur>  findUserById(@PathVariable Long id) {
		 Utilisateur user= userService.findUserById(id);
		 if(user==null) {
			 return new ResponseEntity<Utilisateur>(HttpStatus.NO_CONTENT);
			 
		 }else {
			 return  new ResponseEntity<Utilisateur>(user, HttpStatus.OK);
		 }
		}
	
	
	@PostMapping
	public Utilisateur createUser(@RequestBody Utilisateur user) {
		return userService.createUser(user);
	}
	
	@PutMapping
	public Utilisateur updateUser(@RequestBody Utilisateur user) {
		return userService.updateUser(user);
	}
	 
	@DeleteMapping(path="/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
	@GetMapping(path="/findByFirstname/{firstname}")
	public ResponseEntity<List<Utilisateur>>  findUserByFirstName(@PathVariable String firstname) {
		 List<Utilisateur> user= userService.findByFirstName(firstname);
		 if(user.isEmpty()) {
			 return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
			 
		 }else {
			 return  new ResponseEntity<List<Utilisateur>>(user, HttpStatus.OK);
		 }
		}
	
	
	
	@GetMapping(path="/findByFirstnameAndLastname/{firstname}/{lastname}")
	public ResponseEntity<List<Utilisateur>>  findUserByFirstNameAndLastname(@PathVariable String firstname,@PathVariable String lastname) {
		 List<Utilisateur> user= userService.findByFirstNameAndLastName(firstname, lastname);
		 if(user.isEmpty()) {
			 return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
			 
		 }else {
			 return  new ResponseEntity<List<Utilisateur>>(user, HttpStatus.OK);
		 }
		}
	
	@GetMapping(path="/findByAge")
	public ResponseEntity<List<Utilisateur>>  findUserByAge(@RequestBody List<Integer> ages) {
		 List<Utilisateur> user= userService.findByAgeIn(ages);
		 if(user.isEmpty()) {
			 return new ResponseEntity<List<Utilisateur>>(HttpStatus.NO_CONTENT);
			 
		 }else {
			 return  new ResponseEntity<List<Utilisateur>>(user, HttpStatus.OK);
		 }
		}
	
	
	
	
	


}
