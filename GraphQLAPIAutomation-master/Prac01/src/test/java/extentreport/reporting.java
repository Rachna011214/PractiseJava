package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class reporting {

    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter reporter;
    public ExtentTest test;

    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() { // it will be executed only once, before all the tests, so we won't have duplicate reports or override the file for each test

    	System.setProperty("webdriver.chrome.driver",
				"D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\chromedriver.exe");
		//set the chrome path for all tests only once

        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        System.out.println("the path to report is "+ path);

        reporter = new ExtentSparkReporter(path);

    }

    @BeforeMethod
    public void beforeMethod(){

        driver = new ChromeDriver(); // create the chrome instance before each tests
    }


    @Test
    public void aFastTest() {

        test = extent.createTest("aFastTest");

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.close();

        test.fail("Failed");

    }

    @Test
    public void anotherTestPassed() {

        test = extent.createTest("anotherTestPassed");

        driver.get("https://www.youtube.com");

        System.out.println(driver.getTitle());

        driver.close();

        test.pass("hey my test passed");

    }



    @AfterSuite
    public void afterSuite(){ //executed after all the tests have ran

        extent.attachReporter(reporter);
        extent.flush();
    }


}