package marathan_three;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Edge extends ProjectSpecifiedMethod {

	@Test 
	public void runEdge() {
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Contacts");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Santhosh");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("P");
		//driver.findElement(By.xpath("//input[@name='Email']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']")).getText();
		System.out.println(text);
		if (text.contains(" was created.")) {
			
			System.out.println("Verified");
		} else {
			System.out.println("Not Verfied");
		}
	}
}
