package amazon;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase extends Base {
	@BeforeTest
		public void setup() {
		testName="amazon";
		testDescription="Add to Cart";
		testCatagory="Smoke";
		testAuthor="Santhosh";
	}
		@Test
	public void runCase() throws InterruptedException, IOException {
	
			Home base = new Home(driver,node);
			base
			.enterPhone()
			.clickDeliveryDay()
			.clickRedmi()
			.clickPhone()
			.clickNewWindow()
			.clickCart()
			.verifyPhoneName().closebrowse();
}
}