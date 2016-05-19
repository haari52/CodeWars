package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class EANValidatorTest {

	@Test
	public void testValidate() {
		assertTrue(EANValidator.validate("4003301018398"));
		assertFalse(EANValidator.validate("4003301018392"));
	}

}
