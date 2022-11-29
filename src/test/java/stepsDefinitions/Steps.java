package stepsDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import pageObjects.AssistancePage;
import pageObjects.HomePage;

public class Steps {

	WebDriver driver;
	HomePage hp;
	AssistancePage ap;

	@Given("^User lanch chrome browser$")
	public void user_lanch_chrome_browser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ".//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		hp = new HomePage(driver);
		ap = new AssistancePage(driver);

	}

	@When("^user open URL \"([^\"]*)\"$")
	public void user_open_url(String url) {

		driver.get(url);

	}

	@When("^Clik on link \"([^\"]*)\"$")
	public void clik_on_link(String assistance_link) {
		try {

			hp.ClickAssistance();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"app-layer-base\"]/div/main/div")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"home_children_button\"]"))).click();
			System.out.println("Clicked the checkbox");

		} catch (Exception e) {
			System.out.println("Exception interceptée" + e.getMessage());
		}

	}

	@Then("^Text should be \"([^\"]*)\"$")
	public void text_should_be(String textverify) {

		hp.VerifTextassistance();

	}

	@When("user enter {string} in searchbox")
	public void user_enter_in_searchbox(String searchbox) {

		ap.search(searchbox);

	}

	@When("Click on btn search")
	public void click_on_btn_search() {

		ap.Clikbtnsearch();
	}

	@Then("text should be {string}")
	public void text_shoul_be(String resulttext) {
		ap.VerifText();

	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();

	}

}
