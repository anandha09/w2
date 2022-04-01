package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input")).click();
		boolean selected = driver.findElement(By.xpath("(//div[@class='example']/input)[6]")).isSelected();
		System.out.println(selected);
		boolean selected2 = driver.findElement(By.xpath("(//div[@class='example']/input)[8]")).isSelected();
		System.out.println(selected2);
		if(selected2==true) {
			driver.findElement(By.xpath("(//div[@class='example']/input)[8]")).click();
			
		}
		driver.findElement(By.xpath("(//div[@class='example']/input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/input)[13]")).click();
		driver.findElement(By.xpath("(//div[@class='example']/input)[14]")).click();
		
	}

}
