package marathan_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//*[@data-aura-class='forceHeaderButton salesforceIdentityAppLauncherHeader']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("task"+Keys.ENTER);
		driver.findElement(By.xpath("//*[text()='Task']")).click();
		driver.findElement(By.xpath("(//a[@title='Show one more action'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='branding-actions actionMenu'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("BootCamp"+Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
	}

}
