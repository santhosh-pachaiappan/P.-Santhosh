package trackdfect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EmployeesDetails extends Login {

	public PrivateInformation PrivateInformation() throws InterruptedException {
	   driver.findElement(By.xpath("//*[contains(text(),'Employees')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='o_control_panel_main_buttons d-flex gap-1 d-empty-none d-print-none']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Santhosh");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[@class='o_input'])[2]")).sendKeys("Test Engineer");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[@class='o_input'])[3]")).sendKeys("8098888713");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[@class='o_input'])[5]")).sendKeys("santhosh.p@trackdfect.com");
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys("Santhosh"+Keys.ENTER);
       return new PrivateInformation();
}

	
}
