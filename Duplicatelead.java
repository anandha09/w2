package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//Driver.findElement(By.xpath("//li[@class=' x-tab-strip-active ']/a[@class='x-tab-right']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("a");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		driver.findElement(By.name("submitButton")).click();
	String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text2.equals(text)) {
			System.out.println("Same as duplicate lead name");
		}
		else {
			System.out.println("The Name is not duplicated");
		}
		


	}

}
