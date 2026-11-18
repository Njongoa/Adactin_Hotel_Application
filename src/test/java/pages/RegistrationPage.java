package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")
    WebElement registerHeader;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "re_password")
    WebElement confirmPasswordField;

    @FindBy(id = "full_name")
    WebElement fullNameField;

    @FindBy(id = "email_add")
    WebElement emailField;

    @FindBy(id = "ct-captcha")
    WebElement captchaImage;

    @FindBy(id = "captcha-form")
    WebElement captchaField;

    @FindBy(id = "tnc_box")
    WebElement termsAndConditionsCheckbox;

    @FindBy(id = "Submit")
    WebElement registerButton;

    @FindBy(id = "Reset")
    WebElement resetButton;


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickRegisterLink() {
        registerHeader.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void enterFullName(String fullName) {
        fullNameField.sendKeys(fullName);
    }
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickCaptchaImage() {
        captchaImage.click();
    }
    public void enterCaptcha(String captcha) {
    captchaField.sendKeys(captcha);
    }

    public void clickTermsAndConditions() {
        termsAndConditionsCheckbox.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
    public void clickResetButton() {
        resetButton.click();
    }

}
