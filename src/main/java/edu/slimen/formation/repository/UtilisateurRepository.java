package edu.slimen.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.slimen.formation.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
	
	
	public List<Utilisateur> findByFirstName(String firstname);
	public List<Utilisateur> findByFirstNameAndLastName(String firstname, String lastname);
	
	public List<Utilisateur> findByAgeIn(List<Integer> ages);

}
