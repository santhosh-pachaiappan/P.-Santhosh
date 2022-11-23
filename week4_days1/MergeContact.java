package week4_days1;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import io.github.bonigarcia.wdm.WebDriverManager;

		public class MergeContact {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriverManager.chromedriver().setup();
			    ChromeDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("SURYA");
				driver.findElement(By.id("lastNameField")).sendKeys("Radha");
				driver.findElement(By.name("submitButton")).click();
				System.out.println("print First Name:SURYA");
				System.out.println("print last name:Radha");
				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Merge Contacts")).click();
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
				Set<String> fromname = driver.getWindowHandles();
				List<String> window = new ArrayList<String>(fromname);
				driver.switchTo().window(window.get(1));
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("surya");
				
				driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
				Thread.sleep(2000);
				
				//driver.findElement(By.linkText("13870")).click();
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
				driver.switchTo().window(window.get(0));
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
				Set<String> toname = driver.getWindowHandles();
				ArrayList<String> window1 = new ArrayList<String>(toname );
				driver.switchTo().window( window1.get(1));
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("surya");
				driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
				
				//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]")).click();
				driver.switchTo().window(window1.get(0));
				driver.findElement(By.linkText("Merge")).click();
				Alert alertmsg = driver.switchTo().alert();
				String text=alertmsg.getText();
				alertmsg.accept();
				System.out.println(driver.getTitle());
				driver.quit();
			}
		}
	

