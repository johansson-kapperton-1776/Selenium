package agile_resume;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_resume {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver agile = new ChromeDriver();
		
		agile.get("http://agile1test.com/web/index.php/recruitmentApply/jobs.html");
		
		agile.manage().window().maximize();
		agile.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Thread.sleep(2000);
		
		// //button[@type='button']  tried this xpath as well
		WebElement apply = agile.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary oxd-button']"));
		apply.click();
		
		WebElement firstName = agile.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Rohan");
		
		Thread.sleep(2000);
		
		WebElement lastName = agile.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Kapur");
		
		Thread.sleep(2000);
		
		WebElement email = agile.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("rohankapur2012@gmail.com");
		
		Thread.sleep(2000);
		
		//WebElement browse = agile.findElement(By.xpath("//div[@class='oxd-file-button']"));
		//browse.click();
		
		Thread.sleep(2000);
		
		// C:\Users\rohan\OneDrive\Documents
		File upload = new File("C:\\Users\\rohan\\OneDrive\\Documents\\bus_analyst re.docx");  
		WebElement fileInput = agile.findElement(By.xpath("//input[@name='resume']"));
		
		

	
		//WebElement fileInput = agile.findElement(By.cssSelector("input[@]"));
	    
		fileInput.sendKeys(upload.getAbsolutePath());
		
		Thread.sleep(3000);
		
	    WebElement submit = agile.findElement(By.xpath("//button[normalize-space()='Submit'])"));
	    submit.click();

	}

}
