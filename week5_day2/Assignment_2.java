package week5_day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
	
		/*Asssignment 2:Create new Proposal
	"1. Launch ServiceNow application
	2. Login with valid credential 
	3. Click All and Enter Proposal in filter navigator and press enter 
	4. Click- new  and  fill mandatory fields and click 'Submit' 
		Button.
	5. Verify the successful creation of new Proposal" */
		
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
		sh.findElementByXPath("//input[@id='filter']").sendKeys("My Proposals");
		sh.findElementByXPath("//span[text()='My Proposals']").click();
		WebElement New = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(New);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Santhosh"+Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String verifymsg = driver.findElement(By.xpath("//td[text()='Santhosh']")).getText();
		System.out.println(verifymsg);
		if(verifymsg.contains("Santh")) {
			System.out.println("Created Successfully");
		}
		else {
			System.out.println("Not created Sucessfully");
		}
	
		driver.close();
	}

}
