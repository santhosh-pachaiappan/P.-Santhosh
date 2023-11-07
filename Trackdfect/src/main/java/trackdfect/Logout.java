package trackdfect;

import org.openqa.selenium.By;

public class Logout extends Login {

	public Logout Logout() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@class='o_avatar o_user_avatar rounded']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='dropdown-item']")).click();
     Thread.sleep(2000);
     driver.close();
     Thread.sleep(2000);
     driver.quit();
     return this;
}
}