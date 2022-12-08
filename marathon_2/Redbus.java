package marathon_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*Type ""Chennai"" in the FROM text box and select the first option
04) Type ""Bangalore"" in the To text box and select the first option
05) Select tomorrow's date in the Date field
06) Click Search Buses
07) Print the number of buses shown as results
08) Choose SLEEPER in the left menu 
09) Print the name of the second resulting bus 
10) Click the VIEW SEATS of that bus
11) Take screenshot and close browser
 */
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//label[text()='FROM']/preceding-sibling::input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='66065'][@data-no='2'][@class='sub-city']")).click();
		
		driver.findElement(By.xpath("(//label[text()='TO']/preceding-sibling::input)")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-id='66008'][@data-no='2'][@class='sub-city']")).click();
		
		driver.findElement(By.xpath("//label[text()='Date']/preceding-sibling::input")).click();
		driver.findElement(By.xpath("//td[starts-with(text(),'4')]/ancestor::table")).click();
		
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(1000);
		String numberOfBuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText().replaceAll("[^0-9]","");
		int num =  Integer.parseInt(numberOfBuses);
		System.out.println(num);
		
		driver.findElement(By.xpath("//label[text()='SLEEPER']/ancestor::ul")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println(list.get(1).getText());
		
		Actions a=new Actions(driver);
		WebElement findElement21 = driver.findElement(By.xpath("(//div[text()='View Seats'])[2]"));
		 a.moveToElement(findElement21).perform();
	       // a.scrollByAmount(300, 200).perform();
	        driver.executeScript("arguments[0].click();", findElement21);
	        
	        File source = driver.getScreenshotAs(OutputType.FILE);
	        File destination = new File("./snaps/seatingarrangement.jpeg");
	        FileUtils.copyFile(source, destination);
	        Thread.sleep(2000);
	        driver.close();
		
	}
}
