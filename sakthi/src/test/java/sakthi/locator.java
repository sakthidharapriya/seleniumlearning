package sakthi;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.openqa.selenium.support.ui.Select;
	public class locator {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");  
			driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Jasmine.Morgan");
			driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Jas");
		
			//relative
			//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
			//absolute
			//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
			//link text
			//driver.findElement(By.linkText("Forgotten password?")).click();
			//partial link text
			//driver.findElement(By.partialLinkText("Forgotten")).click();
			//xpath direct
			//driver.findElement(By.xpath("//*[@name='login']")).click();
	//xpath with AND condition
			//driver.findElement(By.xpath("//*[@name='login' and @id='u_0_b']")).click();
			//xpath with OR 
			driver.findElement(By.xpath("//*[@name='login' or @id='u_0_b']")).click();
		}

	}
