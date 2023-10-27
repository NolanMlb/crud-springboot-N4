/**
 * 
 */
package com.webservice.etude.dto;

import java.util.List;

/**
 * 
 */
public record CategorieDto(Long id, String nom, String description, List<ProduitDto> produits) {}
