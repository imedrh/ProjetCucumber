package pageObjects;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssistancePage {

	WebDriver driver;

	// Constructeur qui sera appelé automatiquement dès que l'objet de la classe sera créé
	public AssistancePage(WebDriver driver) {
		this.driver = driver;

	}

	// localisateur du formulaire de recherche
	By searchbox = By.id("search-term");

	// localisateur du bouton rechercher(icone loupe)
	By clicksearch = By.xpath("//*[@id=\"search-container\"]/label/button");

	// localisateur du texte "Résultats de la recherche"
	By resultsearch = By.id("smartlabel");

	// Méthode pour entrer le mot "Enregistrement" dans le formulaire de recherche"
	public void search(String Searchinput) {
		driver.findElement(searchbox).sendKeys(Searchinput);

	}

	// Méthode pour cliquer sur le bouton rechercher (icone loupe)
	public void Clikbtnsearch() {

		driver.findElement(clicksearch).click();

	}

	// Méthode pour verifier l'apparition de texte "Résultats de la recherche"
	public void VerifText() {
		String resulttext = driver.findElement(resultsearch).getText();
		assertEquals(resulttext, "Résultats de la recherche");
	}

}
