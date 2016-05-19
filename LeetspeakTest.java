package introduction;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeetspeakTest {
	Leetspeak myEncoder = new Leetspeak();
	  
	  @Test
	  public void simpleTest(){
	    assertTrue("empty string", myEncoder.encode("").equals(""));
	    assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));
	    assertTrue("aelmou string", myEncoder.encode("aelmou").equals("43l/^^\0(_)"));
	    
	  }
}
