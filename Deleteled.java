package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deleteled {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Driver.findElement(By.name("phoneCountryCode")).clear();
		//Driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		//Driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	String lead = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).getText();
	//String text = Driver.findElement(By.xpath("//a[contains(@class,'linktext')])[4]")).getText();
	System.out.println(lead);
	driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).click();

	driver.findElement(By.className("subMenuButtonDangerous")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys(lead);
	driver.findElement(By.linkText("Find Leads")).click();

	//WebElement findElement = Driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]"));
	if(lead.equals(lead)) {
		System.out.println("no recrds");
	}
	else {
		System.out.println("records");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.close();

	

	}

}
