package week5_day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://dev59421.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("/CvWbm^jQ64C");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(20);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.setImplicitWait(10);
		sh.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
		sh.findElementByXPath("//span[text()='Knowledge']").click();
		
		WebElement New = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(New);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(handles);
		driver.switchTo().window(lst.get(1));
		driver.findElement(By.xpath("//a[text()='IT']")).click();
		driver.switchTo().window(lst.get(0));
		//driver.switchTo().frame(New);
		//driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='list-item arrow']//following-sibling::div[3]")).click();
		driver.findElement(By.xpath("//span[text()='Java']//parent::div")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("Information Technology with java");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		driver.close();
	}
}
