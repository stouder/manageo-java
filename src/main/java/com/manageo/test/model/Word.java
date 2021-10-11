package com.manageo.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(value = { "reponse" })
public class Word implements java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8960417616550081711L;
	
	/**
	 * 	Valeur du nombre testé
	 */
	private Integer number;
	
	/**
	 * 	Valeur technique de la reponse
	 */
	private WordEnum reponse;

	/**
	 * 	Valeur de la reponse qui s'affice
	 */
	private String name;
	
	
	
}
