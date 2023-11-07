package trackdfect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class EmployesAndScheduleActivity extends Login{
	
	public SchuduelActivity SchuduelActivity () throws InterruptedException {
	driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/button/span")).click();
    
    driver.findElement(By.xpath("(//a[contains(text(),'Employees')])[1]")).click();
    Thread.sleep(4000);

    
    driver.findElement(By.xpath("//*[@class='o_searchview_input o_input d-print-none flex-grow-1 w-auto border-0']")).sendKeys("Santhosh"+Keys.ENTER);
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//*[@role='img'])[5]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[contains(text(),'Schedule an activity')]")).click();
    return new SchuduelActivity();
}
}