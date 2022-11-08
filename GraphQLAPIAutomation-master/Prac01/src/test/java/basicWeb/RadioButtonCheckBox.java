package basicWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/radio.html";

		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("site-name")));
		System.out.println("The title of the page is " + driver.getTitle());
		driver.findElement(By.id("vfb-7-2")).click();
		WebElement check = driver.findElement(By.id("vfb-6-1"));
		check.click();
		if (check.isSelected()) {
			System.out.println("The checkbox is selected");
		} else {
			System.out.println("The checkbox is not selected");
		}

		check.click();
		if (check.isSelected()) {
			System.out.println("The checkbox is selected");
		} else {
			System.out.println("The checkbox is not selected");
		}
		/* Checkbox=isSelected(),isEnabled(),isDisplayed() */
		driver.close();
	}

}
