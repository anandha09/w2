package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("AK@gmail.com");
		driver.findElement(By.id("email")).sendKeys("AKkakakakka@gmail.com");
		driver.findElement(By.xpath("//input[contains(@value,'Append')]")).sendKeys("akakakak",Keys.TAB);
		//Driver.findElement(By.xpath("//@value='Append '")).sendKeys("akakakak",Keys.TAB);
		String text = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[contains(@value,'Clear')]")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[contains(@disabled,'true')]")).isEnabled();
		System.out.println(enabled);

	}

}
