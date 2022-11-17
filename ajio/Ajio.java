package ajio;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//chromeoOtions.addArguments("--disable-notifications");
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).click();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//driver.findElement(By.xpath("//label[@for='Men - Travel Bags']")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		for (WebElement webElement:bagBrandList) {
			String travelbags = webElement.getText();
			System.out.println(travelbags);
		}	
	}
}
