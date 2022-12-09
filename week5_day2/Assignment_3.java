package week5_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Assignment_3 {

	public static void main(String[] args) {
		
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
		sh.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		sh.findElementByXPath("//span[text()='Callers']").click();
		WebElement New = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(New);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("santhosh");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("p");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Project");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("santhosh@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("8098888713");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("22213199");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='outputmsg outputmsg_info notification notification-info']")).getText();
		System.out.println(text);
		if (text.contains("santhosh p")) {
			System.out.println("finish");
		} else {
			System.out.println("not yet");
		}
		driver.close();		
	}
}
