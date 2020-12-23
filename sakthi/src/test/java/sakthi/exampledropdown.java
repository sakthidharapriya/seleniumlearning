package sakthi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class exampledropdown {
 public static void main(String[] args) { 
	 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click(); 
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
				//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");  
				driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Jasmine.Morgan");
				driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Jas");
 Select userrole=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
 userrole.selectByVisibleText("Admin");
 Select status=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_status']")));
 //status.selectByVisibleText("Enabled");
 //status.selectByIndex(2);
 status.selectByValue("0");
 }
 }

