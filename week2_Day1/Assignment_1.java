package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1 {

		public static void main(String[] args) {
		// Set path
		
				WebDriverManager.chromedriver().setup();
		
				ChromeDriver driver = new ChromeDriver();
		
				driver.manage().window().maximize();
		
				driver.get("http://leaftaps.com/opentaps/control/main");
		
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
		
		//get the title of page
		
				String title = driver.getTitle(); // crtl+2,l
				System.out.println(title);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("S");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Mechanical");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("To check the Description field");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Santhosh@gmail.com");
				driver.findElement(By.name("submitButton")).click();
				System.out.println(driver.getTitle());
				
		//dropdown
				
		// find the dropdown
				
		//WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//create object for select
		
		//Select selectclass = new Select(source);
		//selectclass.selectByIndex(0);
		//selectclass.selectByValue("source option");
		//selectclass.selectByVisibleText("sorce option");
		
		
	}}
		
		
		
		
