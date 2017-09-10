package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {


	@Test
	public void main() {
	System.setProperty("webdriver.chrome.driver","E:\\Cloudamize\\Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
	driver.manage().window().setSize(new Dimension(1000,500));
	
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	System.out.println(driver.getTitle());
	/*WebElement id= driver.findElement(By.id("Email"));
	id.sendKeys("lunkadsmita@gmail.com");
	
	driver.findElement(By.id("next"));
	
	driver.findElement(By.name("Passwd")).sendKeys("sadsdfasf");
	driver.findElement(By.xpath("//input[@id='signIn']")).click();
	
	String text = driver.findElement(By.cssSelector("span[id='errormsg_0_Passwd']")).getText();
	System.out.println(text);*/
	System.out.println("Test 1");
	System.out.println("Test case pushed in hub");

}
}