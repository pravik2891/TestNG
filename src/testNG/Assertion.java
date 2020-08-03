package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
 
	@Test
	public void checkname() {
		
		String name = "PRAVIN KUMAR";		
		Assert.assertEquals(name, "PRAVIN KUMAR");
		
	}
	@Test
	public void checktrue() {
		boolean value= true;
		Assert.assertTrue(value, "im devil");
		
		
	}
}
