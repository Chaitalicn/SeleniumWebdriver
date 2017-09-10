package TestNg;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgScripts {
	
	@Test(enabled=false)
	public void download() throws IOException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
		driver.get("https://java.com/en/download/win8.jsp");
		driver.findElement(By.xpath("//span[normalize-space()='Agree and Start Free Download']")).click();
		//driver.findElement(By.cssSelector("span:contains('Agree and Start Free Download')")).click();
		Runtime.getRuntime().exec("D:/EclipseWorkspace/Sel51/download.exe");
		System.out.println("Done");
		
	}
	
	
	@Test
	public void calendar() throws ParseException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.id("start-date")).click();
		
		/*String day="9";
		String actmnthyr="February 2017";*/
		
		String currdate = "09/10/2017";
		
		SimpleDateFormat dfmt = new SimpleDateFormat("dd/MM/yyyy");
		Date mydate = dfmt.parse(currdate);
		System.out.println(mydate);
		
		SimpleDateFormat dfmt1 = new SimpleDateFormat("MMMM yyyy");
		String actmnthyr = dfmt1.format(mydate);
		System.out.println(actmnthyr);
		
		SimpleDateFormat dfmt2 = new SimpleDateFormat("d");
		String actday = dfmt2.format(mydate);
		System.out.println(actday);
		
		for(int i=0;i<12;i++){
			String currmnthyear = driver.findElement(By.xpath("//td[@class='limitPrevious jrdp_calendar_month_prev_multi']/following-sibling::td[@class='jrdp_calendar_month_multi']")).getText();
			
		if(currmnthyear.equalsIgnoreCase(actmnthyr)){
			System.out.println("matched");
			driver.findElement(By.xpath("//span[text()='"+actday+"']")).click();
			break;
		}
			else{
				driver.findElement(By.id("jrdp_start-calen_nextmonth_multi_1")).click();
			}
		}
		
		System.out.println("Date selected");
			}
	
	//@Test(enabled=false)
	public void upload_autoit(){
		
		/*ProfilesIni pf = new ProfilesIni();
		FirefoxProfile fp = new FirefoxProfile();
		fp = pf.getProfile("default");*/
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
	
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("photofile")).sendKeys("D:\\Smita\\Tiger.jpg");
		
		
		
	}
	
	@Test(enabled=false)
	public void upload_preference() throws InterruptedException{
		
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("browser.download.useDownloadDir",false);
		//fp.setPreference("browser.download.folderList",1);
		//fp.setPreference("browser.download.lastDir","D:\\");
		fp.setPreference("browser.download.folderList",2);
		fp.setPreference("browser.download.dir","D:\\");
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain, application/vnd.ms-excel, text/csv, application/java-archive, text/comma-separated-values,application/octet-stream,application/exe,application/vnd.microsoft.portable-executable,application/x-msdownload");
		//fp.setPreference("browser.download.manager.showWhenStarting",false);
		
		WebDriver driver = new FirefoxDriver(fp);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://java.com/en/download/win8.jsp");
		driver.findElement(By.xpath("//span[normalize-space()='Agree and Start Free Download']")).click();
		/*driver.get("http://docs.seleniumhq.org/download/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Selenium Html Runner']")).click();*/
		
	}
		
	
	
	
}
