package sakthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("username")).sendKeys("sakthidharapriya");
		driver.findElement(By.id("password")).sendKeys("Seleniumtesting@123");
		driver.findElement(By.xpath("//*[@id=\'post-305\']/div/div/div/div/div/form/p[2]/button")).click();

		driver.findElement(By.xpath("//*[@id=\'menu-item-995\']/a")).click();
		driver.findElement(By.xpath("//*[@id=\'menu-item-995\']/a")).click();
		driver.findElement(By.xpath("//*[@id=\'post-1398\']/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\'section-form-input-type-learning-37\']/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
	
}
}