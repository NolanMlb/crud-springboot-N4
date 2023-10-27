/**
 * 
 */
package com.webservice.etude.dto;

/**
 * 
 */
public record ProduitDto(Long id, String nom, double prix, String description, Long categorieId, String image) {}
