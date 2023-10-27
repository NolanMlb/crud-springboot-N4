/**
 * 
 */
package com.webservice.etude.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.etude.dto.CategorieDto;
import com.webservice.etude.enties.Categorie;
import com.webservice.etude.services.CategorieService;

/**
 * 
 */
@RestController
@RequestMapping(value = "/categorie")
public class CategorieController {

	/* Injection de dependance */
	private CategorieService categorieService;
	
	public CategorieController(CategorieService categorieService) {
		this.categorieService = categorieService;
	}
	
	/* Creation de categorie */
	@PostMapping("/categorie-creer")
	public Categorie creerCategorie(@RequestBody CategorieDto categorieDto) {
		return categorieService.creationCategorie(categorieDto);
	}
	
	/* Creation de categorie */
	@GetMapping("/categorie-liste")
	public List<Categorie> listeCategorie() {
		return categorieService.recupererListeCategorie();
	}
	
	/* Creation de categorie | /categorie/supprimer-par-id?idCategorie=x */
	@DeleteMapping("/categorie-supprimer-par-id")
	public boolean supprimerCategorie(Long idCategorie) {
		return categorieService.supprimerCategorie(idCategorie);
	}
	
	/* Creation de categorie | /categorie/supprimer-par-id/x */     
	@DeleteMapping("/categorie-supprimer-par-id-path/{idCategorie}")
	public boolean supprimerCategoriePathVariable(@PathVariable Long idCategorie) {
		return categorieService.supprimerCategorie(idCategorie);
	}
}
