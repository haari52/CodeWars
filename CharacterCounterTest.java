package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterCounterTest {

	@Test
	public void testValidateWord() {
		assertTrue(CharacterCounter.validateWord("abcabc"));
		assertFalse(CharacterCounter.validateWord("abcabcd"));
		assertTrue(CharacterCounter.validateWord("123abc"));
		assertTrue(CharacterCounter.validateWord("ABC"));
	}

}
