package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"apple"})
	public void apple1() {
		System.out.println("mobile is apple1");
		
	}
	@Test(groups= {"apple"})
	public void apple2() {
		System.out.println("mobile is apple2");
		
	}
	@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("mobile is vivo1");
	
}
	@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("mobile is vivo2");
}
	@Test(groups= {"moto"})
	public void moto1() {
		System.out.println("mobile is moto1");
	
}
	@Test(groups= {"moto"})
	public void moto2() {
		System.out.println("mobile is moto2");
	
}
	@Test(groups= {"lenevo"})
	public void lenevo1() {
		System.out.println("mobile is lenevo1");
		
	}
	@Test(groups= {"lenevo"})
	public void lenevo2() {
		System.out.println("mobile is lenevo2");
	
}


}
