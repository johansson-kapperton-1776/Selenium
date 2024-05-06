package ObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageModel {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver page = base.getdriver();
		
		pages lg = new pages(page);
		lg.enterUsername("standard_user");
		Thread.sleep(2000);
		lg.enterPassword("secret_sauce");
		Thread.sleep(2000);
		lg.clickLogin();
		
		
		
	

	}

}
