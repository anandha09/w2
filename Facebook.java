package week2day2;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	//	Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("Anandh");
		
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(5000);
	  //driver.findElement(By.xpath("(//input[@data-type='text'])[1]")).sendKeys("keerthn");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anandh");
		//driver.close();
	//	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anandh");
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Anandh");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("8778212345");
		driver.findElement(By.xpath("//input[contains(@id,'password_s')]")).sendKeys("Aanandhq");
WebElement findElement = driver.findElement(By.name("birthday_day"));
Select dd=new Select(findElement);
dd.selectByValue("21");
WebElement findElement2 = driver.findElement(By.name("birthday_month"));
Select dd1=new Select(findElement2);
dd1.selectByVisibleText("Oct");
WebElement findElement3 = driver.findElement(By.name("birthday_year"));
Select dd3=new Select(findElement3);
dd3.selectByValue("1998");
driver.findElement(By.name("sex")).click();
	
	

}
}
