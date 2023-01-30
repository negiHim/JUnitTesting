package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class NameFormatTest {
	
	//positive testcase
	@Test
	public void posTest() {
		Testing test = new Testing();
		boolean output = test.checkFormatOfName("Cristino Ronaldo");
		assertEquals(true, output);
	}
	
	//negative testcase
	@Test
	public void negTest() {
		Testing test = new Testing();
		boolean output = test.checkFormatOfName("cristino Ronaldo");
		assertEquals(false, output);
	}
	
	@Test
	public void nullTest() {
		Testing test = new Testing();
		boolean output = test.checkFormatOfName(null);
		assertEquals(false, output);
	}
	

}
