package marathan_three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Chrome extends ProjectSpecifiedMethod {

	@Test 
	public void runChrome() {

		driver.findElement(By.xpath("(//*[text()='Content'])[2]")).click();
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
        driver.executeScript("arguments[0].click();",chatter );
        driver.findElement(By.xpath("(//a[@class='tabHeader'])[3]")).click();
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys("Hello! Who is this and which marathan is this for you");
		driver.findElement(By.xpath("//div[contains(@class,'ql-editor ql-blank')]")).sendKeys("Hello! I am santhosh. this is my third marathan.");
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_brand')]")).click();
		String text=driver.findElement(By.xpath("//span[starts-with(text(),'Hello! Who is this and which marathan is this for you')]/parent::div")).getText();
		System.out.println(text);
		if (text.contains("Hello! Who is this and which marathan is this for you")) {
			System.out.println("Questions Appear");
			
		} else {
			System.out.println("Didnt Appear");

		}
	}
}
