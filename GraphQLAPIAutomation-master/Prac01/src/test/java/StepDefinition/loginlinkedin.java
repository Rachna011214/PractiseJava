package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginlinkedin {

	public static WebDriver driver;

	@Given("^Enter the url of linkedin")
	public void enter_the_url_of_linkedin()  throws Throwable {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\chromedriver.exe");
		driver = new ChromeDriver();

		String url = "https://www.lambdatest.com/";

		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		WebElement login = driver.findElement(By.linkText("Login"));
		System.out.println("Clicking on the login element in the main page");
		login.click();
	

	}

	@When("^User enter details")
	public void user_enter_details()  throws Throwable {
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		

		email.clear();
		System.out.println("Entering the email");
		email.sendKeys("your_email");

		password.clear();
		System.out.println("entering the password");
		password.sendKeys("your_password");
	}

	@When("^clicks on SignIn")
	public void clicks_on_SignIn()  throws Throwable{
		WebElement loginButton = driver.findElement(By.id("login-button"));
		System.out.println("Clicking login button");
		loginButton.click();

		
	}

	@Then("^User is able to login successfully")
	public void user_is_able_to_login_successfully() throws Throwable {
		String title = "Log in";
		

		String actualTitle = driver.getTitle();

		System.out.println("Verifying the page title has started");
		Assert.assertEquals(actualTitle, title, "Page title doesnt match");

		System.out.println("The page title has been successfully verified");

		System.out.println("User logged in successfully");

		driver.quit();
	}




}
