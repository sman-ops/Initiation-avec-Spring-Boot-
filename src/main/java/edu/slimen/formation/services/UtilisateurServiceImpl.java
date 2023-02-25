package edu.slimen.formation.services;

import java.util.List;
import java.util.Optional;
import edu.slimen.formation.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.slimen.formation.entities.Utilisateur;
import edu.slimen.formation.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public List<Utilisateur> getAllUSers() {
		
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur createUser(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Utilisateur updateUser(Utilisateur utilisateur) {
		Optional<Utilisateur>  utOptional =  utilisateurRepository.findById(utilisateur.getId());
		if(utOptional.isEmpty()) {
  			return null;
  		}else {
  			return utilisateurRepository.save(utilisateur);
  		}
			
	}

	@Override
	public void deleteUser(Long id) {
		utilisateurRepository.deleteById(id);
		
	}

	@Override
	public Utilisateur findUserById(Long id) {
		
  Optional<Utilisateur>  utOptional =  utilisateurRepository.findById(id);
  		if(utOptional.isEmpty()) {
  			return null;
  		}else {
  			return utOptional.get();
  		}
    
	}

	@Override
	public List<Utilisateur> findByFirstName(String firstname) {
		
		return utilisateurRepository.findByFirstName(firstname);
	}

}
