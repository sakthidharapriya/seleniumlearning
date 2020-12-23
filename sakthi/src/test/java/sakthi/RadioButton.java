package sakthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

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
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id='learn-press-content-item']/div[2]/div[1]/div/div[1]/div/fieldset/p/label[1]/input"));
        radio1.click();
        Thread.sleep(1000);
 
        WebElement radio2 = driver.findElement(By.xpath("//*[@id='learn-press-content-item']/div[2]/div[1]/div/div[1]/div/fieldset/p/label[2]/input"));
        radio2.click();
        Thread.sleep(1000);
        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\'learn-press-content-item\']/div[2]/div[1]/div/div[1]/div/fieldset/p/label[3]/input"));
        radio3.click();
        Thread.sleep(1000);
        
        
       
      
	}

}
