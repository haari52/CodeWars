package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestIntegerFinderTest {

	@Test
	public void testFindSmallestInt() {
		int actual = SmallestIntegerFinder.findSmallestInt(
					new int[]{34, -345, -1, 100});
		int expected = -345;
		assertEquals(expected, actual);
		
		int actual1 = SmallestIntegerFinder.findSmallestInt(new int[]{
				34, 15, 88, 2});
		int expected1 = 2;
		assertEquals(expected1,actual1);
	}

}
