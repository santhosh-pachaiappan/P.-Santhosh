package week4_days2;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Amazon:
			1.Load the uRL https://www.amazon.in/
			2.search as oneplus 9 pro 
			3.Get the price of the first product
			4. Print the number of customer ratings for the first displayed product
			5. Mouse Hover on the stars
			6. Get the percentage of ratings for the 5 star.
			7. Click the first text link of the first image
			8. Take a screen shot of the product displayed
			9. Click 'Add to Cart' button
			10. Get the cart subtotal and verify if it is correct.*/
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String price_1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price_1);
		price_1 = price_1.replaceAll("[^a-zA-Z0-9]", "");
		String rating = driver.findElement(By.xpath("//span[@aria-label='8']//a//span")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']")).click();
		String stars = driver.findElement(By.xpath("(//span[@class='a-size-base']/a)[1]")).getText();
		System.out.println(stars);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest =new File("./snap/frame.png");
		FileUtils.copyFile(source, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		String total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		if(price_1.equals(total)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}
}