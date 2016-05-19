package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaffeineBuzzTest {

	@Test
	public void testCaffeineBuzz() {
		assertEquals("mocha_missing", CaffeineBuzz.caffeineBuzz(1));
		assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
		assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
		assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
	}

}
