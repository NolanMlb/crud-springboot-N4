/**
 * 
 */
package com.webservice.etude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.etude.dto.ProduitDto;
import com.webservice.etude.enties.Produit;
import com.webservice.etude.services.ProduitService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * 
 */
@RestController
@RequestMapping(value = "/produit")
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	
	/* recuperer la liste des produits */
	@GetMapping("/produit-liste")
	public List<Produit> recupererListeProduit(){
		return produitService.recupererListeProduit();
	}
	
	@GetMapping("/{id}")
	public Produit recupererProduit(@PathVariable Long id) {
		return produitService.recupererProduit(id);
	}
	
	@PostMapping("/produit-creer")
	public Produit ajouterProduit(@RequestBody ProduitDto produit) {
		System.out.println(produit);
		return produitService.creationProduit(produit);
	}
	
	@PutMapping("/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody ProduitDto updatedProduitDto) {
        return produitService.modifierProduit(id, updatedProduitDto);
    }
	
	@DeleteMapping("/{id}")
	public boolean supprimerProduit(@PathVariable Long id) {
		return produitService.supprimerProduit(id);
	}
}
