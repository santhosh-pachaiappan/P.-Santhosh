package week7_day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_wait_Assignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span")).click();
		
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"j_idt87:j_idt90\"]/span")));
		
		until.click();
		
		String visible = until.getText();
		
		System.out.println(visible);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt92\"]/span")).click();
		
		WebElement until2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt93\"]/span"));
		
		wait.until(ExpectedConditions.invisibilityOf(until2));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//span[text()='Did you notice?']"), "Did you notice?"));
		
		String Str = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		
		System.out.println(Str);
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Click Second']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		Actions AC = new Actions(driver);
		
		AC.click(element).perform();
		
		String SecondButton = element.getText();
		
		System.out.println(SecondButton);
		
		driver.close();
	}
}
