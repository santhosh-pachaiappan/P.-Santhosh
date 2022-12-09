package week5_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Assignment 1:Ordering mobile
		"1. Launch ServiceNow application
		2. Login with valid credentials username as admin and password as India@123
		3. Click-AllEnter Service catalog in filter navigator and press enter 
		4. Click on  mobiles
		5.Select Apple iphone6s
		6.Update color field to rose gold and storage field to 128GB
		7.Select  Order now option
		8.Verify order is placed and copy the request number"*/
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://dev59421.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("/CvWbm^jQ64C");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.setImplicitWait(10);
		sh.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement find = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(find);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		sh.findElementByXPath("//h2[text()='Apple iPhone 13']").click();
		driver.findElement(By.xpath("//label[text()='No']")).click();
		driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")).click();
		WebElement net = driver.findElement(By.xpath("//*[contains(@class,'form-control cat_item_option ')]"));
		Select se= new Select(net);
		se.selectByIndex(1);
		driver.findElement(By.xpath("//input[@value='pink']/parent::span")).click();
		driver.findElement(By.xpath("//input[@value='128']/parent::span")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String text = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println(text);
		
		if (text.contains("submitted")) {
			System.out.println("order placed successfully");
		} else {
					System.out.println("not Placed");
		}	
		
		String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(text2);
		driver.close();
	}
}
