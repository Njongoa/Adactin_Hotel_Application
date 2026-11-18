package tests;

import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends Base{

    @Test
    public void clickRegisterLinkTest() {
        registrationPage.clickRegisterLink();
    }

    @Test(priority = 1)
    public void enterUsernameTest(){
        registrationPage.enterUsername("Aphiwe86");
        takesScreenshots.takesSnapShot(driver, "Registration Page");
    }
    @Test(priority = 2)
    public void enterPasswordTest(){
        registrationPage.enterPassword("Trymybest@123");
    }
    @Test(priority = 3)
    public void confirmPasswordTest(){
        registrationPage.confirmPassword("Trymybest@123");
    }

    @Test(priority = 4)
    public void enterFullNameTest() {
        registrationPage.enterFullName("Aphiwe");
    }
    @Test(priority = 5)
    public void enterEmailTest() {
        registrationPage.enterEmail("njongo102@gmail.com");
    }
    @Test (priority = 6)
    public void clickCaptchaImage(){
        registrationPage.clickCaptchaImage();
    }
    @Test(priority = 7)
    public void enterCaptchaText() {
        registrationPage.enterCaptcha("captcha-form");
    }
    @Test (priority = 8)
    public void clickTermsAndConditionsTest() {
        registrationPage.clickTermsAndConditions();
    }

    @Test(priority = 9)
    public void clickRegisterButtonTest() {
        registrationPage.clickRegisterButton();
    }

    @Test(priority = 10)
    public void clickResetTestButton() {
        registrationPage.clickResetButton();
    }


    }