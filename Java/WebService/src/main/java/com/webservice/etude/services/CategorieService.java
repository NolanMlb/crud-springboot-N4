/**
 * 
 */
package com.webservice.etude.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.etude.dto.CategorieDto;
import com.webservice.etude.enties.Categorie;
import com.webservice.etude.repositories.CategorieRepository;

/**
 * 
 */
@Service
public class CategorieService {

	/* Injection de dependances */
	@Autowired
	private CategorieRepository categorieRepository;
	
	/* Recuperer La liste des categories */
	public List<Categorie> recupererListeCategorie(){
		return categorieRepository.findAll();
	}
	
	/* Recuperer La categorie par identifiant */
	public Categorie recupererCategorieParId(Long idCategorie){
		return categorieRepository.findById(idCategorie).get();
	}
	
	/* Création de categorie */
	public Categorie creationCategorie(CategorieDto categorieDto) {
		
		/* Les informations du DTO */
		Categorie categorie = new Categorie();
		categorie.setDescription(categorieDto.description());
		categorie.setNom(categorieDto.nom());
		
		return categorieRepository.save(categorie);
	}
	
	/* Supprimer une categorie */
	public boolean supprimerCategorie(Long idCategorie){
		try {
			if(idCategorie != null) {
				categorieRepository.deleteById(idCategorie);
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		
		return false;
	}
}
