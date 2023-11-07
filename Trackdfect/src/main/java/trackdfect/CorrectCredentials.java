package trackdfect;

import org.openqa.selenium.By;

public class CorrectCredentials extends Login{

	public trackdfect.EmployeesDetails EmployeesDetails() {

			driver.findElement(By.id("login")).clear();
	        driver.findElement(By.id("password")).clear(); 
	        driver.findElement(By.id("login")).sendKeys("santhan.y@trackdfect.com");
	        driver.findElement(By.id("password")).sendKeys("santhan@123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        return new EmployeesDetails();
	}

	
	}


