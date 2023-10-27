/**
 * 
 */
package com.webservice.etude.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webservice.etude.dto.EtudiantDto;

/**
 * @author marc
 */
@Controller /* Permet de preciser que la class est un controller */
@RequestMapping(value = "/api/webservice") /* Permet de perciser le nom de la base de l'url */
public class EtudiantController {
	
	/* Recuperer la liste des etudiants */
	@RequestMapping(value = "/etudiant-list", method = RequestMethod.GET)
	@ResponseBody
	public List<EtudiantDto> recupererListeEtudiants() {
		
		EtudiantDto etudiantDto1 = new EtudiantDto();
		etudiantDto1.setMatricule("MAT-00001");
		etudiantDto1.setNom("Dylan");
		etudiantDto1.setPrenom("Thomas");
		
		EtudiantDto etudiantDto2 = new EtudiantDto();
		etudiantDto2.setMatricule("MAT-00002");
		etudiantDto2.setNom("Marc");
		etudiantDto2.setPrenom("Nicolas Ange");
		
		return Arrays.asList(etudiantDto1, etudiantDto2);
	}

}
