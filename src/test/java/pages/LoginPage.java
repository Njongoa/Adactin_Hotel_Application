package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//td[contains(@class, 'login_title')]")
    WebElement newExistingUserText;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyAdactinLoginPage() {
        Assert.assertTrue(newExistingUserText.isDisplayed(), "Adactin logo is not displayed");
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void validateLandingPageAfterLogin() {
        String currentUrl = driver.getCurrentUrl();

        // If login is successful, user should go to Search Hotel page, otherwise, an error message should be displayed

        if (currentUrl.contains("SearchHotel.php")) {
            Assert.assertTrue(currentUrl.contains("SearchHotel.php"), "Login successful page not displayed");
        } else {
            WebElement errorMessage = driver.findElement(
                    By.xpath("//b[contains(., 'Invalid Login details or Your Password might have expired.')]")
            );

            Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");
            String messageText = errorMessage.getText();

            Assert.assertTrue(messageText.contains("Invalid Login details or Your Password might have expired."),
                    "Expected invalid login message is missing");

            Assert.assertTrue(messageText.contains("Click here"),
                    "Expected reset password link text is missing");
        }
    }
}
