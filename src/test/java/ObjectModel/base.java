package ObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver getdriver()  {
		
		WebDriver page = new ChromeDriver();
		page.get("https://www.saucedemo.com/v1/");
		
		page.manage().window().maximize();
		page.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		return page;
	}

}
