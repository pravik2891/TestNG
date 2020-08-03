package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizing {
	@Test
	@Parameters("Name")
	public void whoIsThis(String nameFromXml){
		System.out.println("I am "+ nameFromXml);
	}

}
