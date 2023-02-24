package edu.slimen.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.slimen.formation.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
