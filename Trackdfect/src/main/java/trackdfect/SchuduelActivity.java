package trackdfect;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchuduelActivity extends Login {
	
	public Logout Logout () throws InterruptedException {
	 driver.findElement(By.xpath("(//*[@class='o-autocomplete--input o_input'])[1]")).click();
     WebDriverWait w = new WebDriverWait(driver,10);
    
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Activity Type']/following::a)[1]")));

     driver.findElement(By.xpath("(//*[text()='Activity Type']/following::a)[1]")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Done & Schedule Next')]")).click();
     
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[@class='o-autocomplete--input o_input'])[1]")).click();
     WebDriverWait x = new WebDriverWait(driver,10);
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Activity Type']/following::a)[1]")));
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[text()='Activity Type']/following::a)[2]")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Done & Schedule Next')]")).click();
     
     
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[@class='o-autocomplete--input o_input'])[1]")).click();
     WebDriverWait y = new WebDriverWait(driver,10);
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Activity Type']/following::a)[1]")));
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[text()='Activity Type']/following::a)[3]")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Done & Schedule Next')]")).click();
     
     
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[@class='o-autocomplete--input o_input'])[1]")).click();
     WebDriverWait z = new WebDriverWait(driver,10);
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[text()='Activity Type']/following::a)[1]")));
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//*[text()='Activity Type']/following::a)[4]")).click();
     driver.findElement(By.xpath("//*[contains(text(),'Done & Schedule Next')]")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[@name='action_close_dialog']")).click(); 
     return new Logout();
}
}