package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("a");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[6]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("verified");
		}
		else {
			System.out.println("not verified");
		}
		driver.findElement(By.linkText("Edit")).click();
		String attribute = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ANANDH Technology");
		
		
driver.findElement(By.xpath("(//input[@name='submitButton'])")).click();
String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(text);
if(text.equals(attribute)) {
	System.out.println("crct");
}
else {
	System.out.println("nt crt");
}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.close();

	}

}
