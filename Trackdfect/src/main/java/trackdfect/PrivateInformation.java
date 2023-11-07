package trackdfect;

import org.openqa.selenium.By;

public class PrivateInformation extends Login {

	public EmployesAndScheduleActivity EmployesAndScheduleActivity () throws InterruptedException {
	
	   driver.findElement(By.xpath("(//*[@class='nav-link'])[1]")).click();
       Thread.sleep(1000);
       driver.findElement(By.id("private_street_0")).sendKeys("Trackdfect");
       Thread.sleep(1000);
       driver.findElement(By.id("private_city_0")).sendKeys("Chennai");
     
       driver.findElement(By.xpath("(//*[@type='text'])[11]")).sendKeys("Tamil Nadu (IN)");
     
       driver.findElement(By.xpath("(//*[@type='text'])[12]")).sendKeys("6000018");
    
       driver.findElement(By.xpath("(//*[@type='text'])[13]")).sendKeys("India");
   
       driver.findElement(By.xpath("//option[contains(text(),'Single')]")).click();
      
       driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
      
       driver.findElement(By.xpath("(//*[@type='text'])[30]")).click();
       
       driver.findElement(By.xpath("(//span[contains(text(),'5')])[1]")).click();
       return new EmployesAndScheduleActivity();
}

	
}
