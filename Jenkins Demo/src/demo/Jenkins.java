package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins {
	
	@Test
	public void testJenkins() {
		
        System.setProperty("webdriver.gecko.driver","C:\\eclipse-workspace\\Jenkins Demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/");
		
		driver.close();
		System.out.println("Jenkins File");
	}

}
