package TestNg;

import org.testng.annotations.Test;

public class Payment{
	
	@Test
	public void pay1(){
		
		System.out.println("In Pay1");
	}
	
	@Test(enabled=false)
	public void pay2(){
		
		System.out.println("In Pay2");
	}

	@Test
	public void pay3(){
		
		System.out.println("In Pay3");
	
}

	@Test
	public void pay4(){
	
		System.out.println("In Pay4");
		
}
	
	
	

}


