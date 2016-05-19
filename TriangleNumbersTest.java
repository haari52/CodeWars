package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleNumbersTest {

	@Test
	public void testIsTriangleNumber() {
		assertEquals(TriangleNumbers.isTriangleNumber(125250), true);
	}
	
	@Test
	public void testIsTriangleNumber1() {
		assertEquals(TriangleNumbers.isTriangleNumber(3126250), true);
	}
	
	@Test
	public void testIsTriangleNumber3() {
		assertEquals(TriangleNumbers.isTriangleNumber(8), false);
	}

}
