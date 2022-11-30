package week4_days2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int Columns = columns.size();
		System.out.println(Columns);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int Rows = rows.size();
		System.out.println(Rows);
	}

}
