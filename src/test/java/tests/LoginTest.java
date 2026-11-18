package tests;

import org.testng.annotations.Test;

public class LoginTest extends Base{

    @Test
    public void verifyAdactinLogoImageTest(){
        loginPage.verifyAdactinLoginPage();
        takesScreenshots.takesSnapShot(driver, "Adactin Login Page");
    }
    @Test(priority = 1)
    public void enterUsernameTest(){
        loginPage.enterUsername("njongo1986");
    }
    @Test(priority = 2)
    public void enterPasswordTest(){
        loginPage.enterPassword("Siyazama@2013");
    }
    @Test(priority = 3)
    public void clickLoginButtonTest(){
        loginPage.clickLoginButton();
    }
    @Test(priority = 4)
    public void validateLandingPageAfterLoginNegativeTest(){
        loginPage.validateLandingPageAfterLogin();
        takesScreenshots.takesSnapShot(driver, "Landing Page After Login");
    }

}
