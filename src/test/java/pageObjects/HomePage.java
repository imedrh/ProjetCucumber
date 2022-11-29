package pageObjects;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	// Constructeur qui sera appelé automatiquement dès que l'objet de la classe sera créé
	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	// localisateur du lien Assistance
	By assistance_link = By
			.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/section/div/div/div[2]/a[2]/div");

	// localisateur du texte "L’agent virtuel est à votre disposition."
	By textverify = By.xpath("//*[@id=\"contextual-banner\"]/div/h1");

	// Méthode pour cliquer sur le lien Assistance
	public void ClickAssistance() {
		try {
			driver.findElement(assistance_link).click();

			//Attendre que l'element devient cliquable ,durée d'expiration 30s (Captcha sous forme d'image)
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"app-layer-base\"]/div/main/div")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"home_children_button\"]"))).click();
			System.out.println("Clicked the checkbox");
		} catch (Exception e) {
			System.out.println("Exception interceptée" + e.getMessage());
		}
	}

	// Méthode pour verifier l'existance du texte "L’agent virtuel est à votre disposition."
	public void VerifTextassistance() {
		String assistancetext = driver.findElement(textverify).getText();

		assertEquals(assistancetext, "L’agent virtuel est à votre disposition.");

	}

}
