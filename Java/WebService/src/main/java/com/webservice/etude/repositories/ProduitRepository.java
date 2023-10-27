/**
 * 
 */
package com.webservice.etude.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.etude.enties.Categorie;
import com.webservice.etude.enties.Produit;

/**
 * 
 */
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

	/* Recuperer la liste des produits en fonction de la categorie */
	public List<Produit> findByCategorie(Categorie categorie);
	
	/* Recuperer la liste des produits en fonction de l'identifiant de la categorie */
	public List<Produit> findByCategorieId(Long categorie_id);
	
	public Produit findProduitById(Long produit_id);
	
}
