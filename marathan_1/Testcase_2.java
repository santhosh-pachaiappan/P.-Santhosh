package marathan_1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_2 {

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
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-icon-waffle_container slds-context-bar__button slds-button forceHeaderButton salesforceIdentityAppLauncherHeader']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Santhosh");
		//driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("santhosh"+Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='input-216']")).click();
		driver.findElement(By.xpath("//input[@id='input-216']")).sendKeys("12/09/2022"+Keys.ENTER);
		driver.findElement(By.xpath("//button[@id='combobox-button-235']")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.close();
		
	}
}
