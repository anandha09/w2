package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement=	driver.findElement(By.id("dropdown1"));
		Select DD1=new Select(findElement);
		DD1.selectByIndex(1);
		WebElement findElement1=	driver.findElement(By.name("dropdown2"));
		Select DD2=new Select(findElement1);
		DD2.selectByVisibleText("Appium");
		WebElement findElement2=	driver.findElement(By.name("dropdown3"));
		Select DD3=new Select(findElement2);
		DD3.selectByValue("4");
		WebElement findElement3=	driver.findElement(By.className("dropdown"));
		Select DD4=new Select(findElement3);
		java.util.List<WebElement> options = DD4.getOptions();
		System.out.println(options.size());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Appium");
		
		

	}

}
