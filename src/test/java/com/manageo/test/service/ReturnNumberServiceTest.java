package com.manageo.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manageo.test.model.Word;
import com.manageo.test.model.WordEnum;
import com.manageo.test.service.ReturnNumberService;

@SpringBootTest
public class ReturnNumberServiceTest {

	@Autowired
	ReturnNumberService returnNumberService;

	@Test
	public void getWordMultupie3() {
		assertThat(returnNumberService.getWord(33)).isNotNull();
		assertThat(returnNumberService.getWord(33)).isNotEmpty();
		assertThat(checkWordExists(returnNumberService.getWord(33), WordEnum.FIZZ)).isEqualTo(true);
	}

	@Test
	public void getWordMultupie5() {
		assertThat(returnNumberService.getWord(55)).isNotNull();
		assertThat(returnNumberService.getWord(55)).isNotEmpty();
		assertThat(checkWordExists(returnNumberService.getWord(55), WordEnum.BUZZ)).isEqualTo(true);
	}

	@Test
	public void getWordMultupie3and5() {
		assertThat(returnNumberService.getWord(15)).isNotNull();
		assertThat(returnNumberService.getWord(15)).isNotEmpty();
		assertThat(checkWordExists(returnNumberService.getWord(15), WordEnum.FIZZ)).isEqualTo(true);
		assertThat(checkWordExists(returnNumberService.getWord(15), WordEnum.BUZZ)).isEqualTo(true);
	}

	@Test
	public void getNumbers() {
		String words = returnNumberService.getNumbers(6);
		assertThat(words).isNotNull();
		assertEquals("FizzBuzzFizz", words);
	}

	private Boolean checkWordExists(List<Word> words, WordEnum expectedWord) {
		if (words == null || expectedWord == null) {
			return Boolean.FALSE;
		}
		Boolean matchWord = Boolean.FALSE;
		for (Word word : words) {
			if (word.getReponse().compareTo(expectedWord) == 0) {
				matchWord = Boolean.TRUE;
				break;
			}
		}
		return matchWord;
	}
}
