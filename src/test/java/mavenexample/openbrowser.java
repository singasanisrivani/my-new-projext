package mavenexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbrowser {
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//Eclipse//drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}

}
