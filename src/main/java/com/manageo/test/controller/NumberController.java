package com.manageo.test.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manageo.test.model.Word;
import com.manageo.test.service.ReturnNumberService;

@RestController
public class NumberController {

	@Autowired
	private ReturnNumberService reponseService;
	
	@GetMapping(value = "/number/{id}", produces = "application/json")
	public ResponseEntity<List<List<Word>>> getnumber(@PathVariable("id") Integer id) {
		//return reponseService.getWords(15);
		//return new ResponseEntity<Word>(reponseService.getNumbers(id), HttpStatus.CREATED);
		LocalDate localDate = LocalDate.now(); 
		String d1Str = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));  
      
		HttpHeaders headers = new HttpHeaders();
	        headers.add("date", d1Str);
		return ResponseEntity.ok().headers(headers).body(reponseService.getWords(id));
	}
	

}
