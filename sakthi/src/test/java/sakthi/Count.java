package sakthi;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Count {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?source=hp&ei=vdHgX7OaEYTE4-EP6NSVkAQ&q=testing&oq=testing&gs_lcp=CgZwc3ktYWIQAzIICAAQsQMQgwEyCAgAELEDEIMBMgIIADIFCAAQsQMyBQgAELEDMggIABCxAxCDATICCAAyBQgAELEDMgIIADIFCAAQsQM6CwgAELEDEIMBEMkDOgUILhCxAzoUCC4QsQMQgwEQxwEQowIQyQMQkwJQmg1Yvh1g8ydoAHAAeACAAYUCiAHiC5IBBTAuMi41mAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwjz7PnCw9_tAhUE4jgGHWhqBUIQ4dUDCAc&uact=5");
		List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
        
        int linkCount = links.size();     // Count the total Link list on Web Page
        
        System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
        
       // List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
        
      //  int elementsCount = allElements.size();     //Count the total all element on web page
        
      //  System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
			}

}
