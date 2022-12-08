package marathon_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Testcase_One {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*Architect Certifications
		==========================
		1. Launch Salesforce application https://login.salesforce.com/
		2. Login with Provided Credentials
		3. Click on Learn More link in Mobile Publisher  and click Confirm
		4. Click Learning and Mouse hover on Learning On Trailhead
		5. Select SalesForce Certification 
		6. Choose Your Role as Salesforce Architect and verify the URL
		7. Get the Text(Summary) of Salesforce Architect 
		8. Get the List of Salesforce Architect Certifications Available
		9. Click on Application Architect 
		10.Get the List of Certifications available
		
		*hari.radhakrishnan@qeagle.com
		Testleaf$321*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> handle = driver.getWindowHandles();
		List<String>lst=new ArrayList<String>(handle);
		driver.switchTo().window(lst.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		//shadow.setImplicitWait(30);
		Thread.sleep(1000);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		WebElement learn =shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions obj=new Actions(driver);
		obj.moveToElement(learn).perform();
		WebElement scroll = shadow.findElementByXPath("//a[text()='Career Paths']");
		obj.scrollToElement(scroll).perform();
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
		System.out.println(" Salesforce Architect url"+driver.getCurrentUrl());
		
		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text sl')]")).getText();
		System.out.println("summary"+summary);
		
		List<WebElement> certificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i <certificate.size() ; i++) {
			System.out.println("Salesforce Architect Certifications"+certificate.get(i).getText());
			
		}
		 
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	
        List<WebElement> appArc = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
        for (int i = 0; i < appArc.size(); i++) {
			System.out.println("Application Architect Certifications"+appArc.get(i).getText());
		}

	}

}

