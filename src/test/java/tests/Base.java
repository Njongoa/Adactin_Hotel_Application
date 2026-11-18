package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.BrowserFactory;
import utilities.TakesScreenshots;

public class Base {

    BrowserFactory browserFactory= new BrowserFactory();

    final WebDriver driver = browserFactory.launchBrowser("edge","https://adactinhotelapp.com/index.php");

    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    public TakesScreenshots takesScreenshots = new TakesScreenshots();

    public RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
}



