package edu.slimen.formation.services;

import java.util.List;

import edu.slimen.formation.entities.Utilisateur;

public interface UtilisateurService {
	
	
	// methodes CRUD basiques
	public List<Utilisateur>  getAllUSers();
	public Utilisateur createUser(Utilisateur utilisateur);
	public Utilisateur updateUser(Utilisateur utilisateur);
	public void deleteUser(Long id);
	public Utilisateur findUserById(Long id);
	
	
	// methodes avancées
	
	public List<Utilisateur> findByFirstName(String firstname);
	
	

}

