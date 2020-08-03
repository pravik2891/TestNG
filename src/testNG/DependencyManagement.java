package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {
	@Test
	public void SSLC() {
		System.out.println("i cleared SSLC");
	}
	@Test(dependsOnMethods="SSLC")
	public void HSC() {
		
		System.out.println("i cleared HSC");
	}
	@Test(dependsOnMethods="HSC")
	public void ENGG() {
		System.out.println("i cleared ENGG");
	}
}
