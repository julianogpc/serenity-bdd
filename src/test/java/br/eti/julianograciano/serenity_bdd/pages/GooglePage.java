package br.eti.julianograciano.serenity_bdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * <p>Classe de Step Definitions do Cucumber.</p>
 *
 * @author Juliano Graciano Pereira Costa
 * @version $Id: $Id
 * @since 1.0.0
 */
public class GooglePage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(id = "btnK")
    private WebElement searchButton;

    public GooglePage(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }

    public void openPage() {
        open();
        driver.navigate().refresh();
    }

    public void fillsSearchField(String text) {
        wait.until(driver -> searchField.isDisplayed());
        searchField.sendKeys(text);
        searchField.sendKeys(Keys.TAB);
    }

    public void clickOnSearchGoogle() {
        searchButton = wait.until(elementToBeClickable(searchButton));
        searchButton.click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
