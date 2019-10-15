package s1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam1 {
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver","C://Users//hp//Downloads//Eclipse//drivers//chromedriver_win32//chromedriver.exe");	
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	  driver.close();
	
	}
}
