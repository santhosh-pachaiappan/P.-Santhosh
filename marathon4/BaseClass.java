package marathon4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import util.ReadExcel;

public class BaseClass {
	public Shadow shadow;
	 public ChromeDriver driver;
	 public String excelfile	;
	 public static ExtentReports extent;
	 public ExtentTest test, node;
	 public String testName,testDescription,testCatagory,testAuthor;
	
	 @BeforeSuite
	  public void startReport() {
		
	    ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
	    reporter.setAppendExisting(true);
	    extent=new ExtentReports();
	    extent.attachReporter(reporter);
	}
	 
	 @BeforeClass
	public void testcaseDetails() {
		 
		test = extent.createTest(testName,testDescription);
	    test.assignCategory(testCatagory);
	    test.assignAuthor(testAuthor);
	}
	 
	 public int takeSnap() throws IOException {
		 int ranNum=(int)(Math.random()*99999+100000);
	     File source = driver.getScreenshotAs(OutputType.FILE);
	     File destination = new File("./snap/img"+ranNum+".png");
	     FileUtils.copyFile(source, destination);
	     return ranNum;
	 }
	 
	public void reportStep(String stepDes,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			node.pass(stepDes,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		}
			  else if(status.equalsIgnoreCase("fail")) {
		            node.fail(stepDes,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
		        }
	}
	
	 @AfterSuite 
	 public void stoptReport() {
		  extent.flush();
	  }
	 
	  @BeforeMethod
	public void LaunchBrowser() {
		 node=test.createNode(testName);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.manage().window().maximize();
		
		driver.get("https://dev60045.service-now.com/");
		shadow  = new Shadow(driver);
	}
	  
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] testData() throws IOException {
	    String[][] readData = ReadExcel.readdata(excelfile);
	    return readData;
	}
}
