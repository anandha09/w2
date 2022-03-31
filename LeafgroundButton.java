package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement findElement = driver.findElement(By.id("position"));
		System.out.println(findElement.getLocation());
		WebElement findElement2 = driver.findElement(By.xpath("//button[contains(text(),'What color am I?')]"));
		System.out.println(findElement2.getCssValue("color"));
		WebElement findElement3 = driver.findElement(By.id("home"));
		System.out.println(findElement3.getSize());
		

	}
}
