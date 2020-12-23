package sakthi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCount {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			WebElement search= driver.findElement(By.name("q"));
			search.sendKeys("Testing");
			search.sendKeys(Keys.ENTER);
			List<WebElement> Link= driver.findElements(By.tagName("a"));
			int LinkCount=Link.size();
			System.out.println("No. of links: "+ LinkCount);
			
			
			
	}

}
