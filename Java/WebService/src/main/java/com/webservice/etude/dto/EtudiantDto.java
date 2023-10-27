/**
 * 
 */
package com.webservice.etude.dto;

/**
 * 
 */

/* DTO : Data Transfert Object */
/* POJO : Plain Old Java Object */
public class EtudiantDto {
	
	private String matricule;
	private String nom;
	private String prenom;
	
	
	public EtudiantDto() {
		super();
	}
	
	public EtudiantDto(String matricule, String nom, String prenom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}
	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "EtudiantDto [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
