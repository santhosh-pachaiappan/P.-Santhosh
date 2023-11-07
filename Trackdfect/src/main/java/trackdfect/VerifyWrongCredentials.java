package trackdfect;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyWrongCredentials extends Login {

	public CorrectCredentials CorrectCredentials () throws InterruptedException {
		
        driver.findElement(By.id("login")).sendKeys("santhoshpachaiappan@gmail.com");
        driver.findElement(By.id("password")).sendKeys("test@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        WebElement e=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/form/p"));
        System.out.println(e.getText());
        return new CorrectCredentials() ;
        }

}