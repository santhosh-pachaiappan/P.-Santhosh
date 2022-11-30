package week4_days2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//chromeoOtions.addArguments("--disable-notifications");
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		List<WebElement>Header = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
		int HeadSize= Header.size();
		System.out.println(HeadSize);
		
		List<WebElement>row = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		int rowSize= row.size();
		System.out.println(rowSize);
		
		List<String>Security = new ArrayList <String>();
		
		for (int i = 1; i<rowSize; i++) {
			
			String Result = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr["+i+"]//td[3]")).getText();
			
			Security.add(Result);
		}
			Set<String> remove = new LinkedHashSet<String>(Security);
			
			int r1= remove.size();
			
			if (rowSize>r1) {
				System.out.println("Yes....Duplicates are removed");
			}
			else {
				System.out.println("Yes..... Duplicates are not removed");
			}
			System.out.println(remove);
		}
}

