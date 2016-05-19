package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveReverseStringTest {

	@Test
	public void testReverse() {
		RecursiveReverseString recursiveReverseString=new RecursiveReverseString();
		assertEquals("dlrow olleh", recursiveReverseString.reverse("hello world"));
		assertEquals("akirah", recursiveReverseString.reverse("harika"));
	}

}
