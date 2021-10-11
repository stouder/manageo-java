package com.manageo.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.manageo.test.model.Word;
import com.manageo.test.model.WordEnum;


@Component
public class WordService {

	/**
	 * 	liste de les nots à afficher possible 
	 */
	public List<Word> getAvailableWord() {
			List<Word> words = Stream.of(WordEnum.values()).map(w -> new Word(w.getNumber(), w,w.getName()))
					.collect(Collectors.toCollection(ArrayList::new));
			return words;
			
		}
	}

