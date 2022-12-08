package marathan_1;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Account {

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
		Thread.sleep(1000);
		WebElement accountTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accountTab);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='slds-input'])[2]")).sendKeys("Santhosh");
	//	driver.findElement(By.xpath("//button[@id='combobox-button-251']")).click();
	//	driver.findElement(By.xpath("//*[@id='combobox-button-251-1-251']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
	}
}
