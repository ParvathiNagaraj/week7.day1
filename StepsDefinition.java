package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition {

	public ChromeDriver driver;

	@Given("Open the Chrome browser")
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@And("Load the Application URL")
	public void loadApplication() {

		driver.get("http://leaftaps.com/opentaps/");

	}

	@And("Enter the username as {string}")
	public void enteruserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}

	@And("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void clickLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void expectedResult() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		if (displayed) {
			System.out.println("The HomePage is Displayed");
		}

		else {
			System.out.println("The HomePage is not Displayed");
		}
	}

	@But("ErrorMessage should be displayed")
	public void errorMessage() {

		boolean displayed2 = driver.findElement(By.id("errorDiv")).isDisplayed();

		if (displayed2) {

			System.out.println("ErrorMessage is Displayed");

		}

		else {
			System.out.println("ErrorMessage is not Displayed");
		}
	}

}
