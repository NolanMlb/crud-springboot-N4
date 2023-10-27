/**
 * 
 */
package com.webservice.etude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.etude.enties.Categorie;

/**
 * 
 */
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
