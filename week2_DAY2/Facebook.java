package week2_DAY2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("santhosh");
		driver.findElement(By.name("lastname")).sendKeys("sv");
		driver.findElement(By.name("reg_email__")).sendKeys("sdfdfd");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Santhosh123");
		WebElement birthdayday = driver.findElement(By.name("birthday_day")); 
		Select day = new Select(birthdayday); 
		day.selectByValue("5");
		WebElement birthdaymonth = driver.findElement(By.name("birthday_month")); 
		Select month = new Select(birthdaymonth);
		month.selectByVisibleText("dec"); 
		WebElement birthdayyear = driver.findElement(By.name("birthday_year")); 
		Select year = new Select(birthdayyear);
		year.selectByValue("1996"); 
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
