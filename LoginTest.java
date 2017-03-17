package com.qa.kau.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

/**
 * Created by Hash on 09/03/2017.
 */
public class LoginTest {


    private By txtUsername = By.id("username");
    private By txtpassword = By.id("password");
    private By btnLogin = By.xpath("//button[contains(text(),'Login') and @class='btn btn-primary btn-block']");
    private By lblLoginErrorMessage =By.xpath("//div[@class='alert alert-danger ng-binding']");
    WebDriver driver = null;

    public LoginTest() {

        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\Chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://rl6.efshipoci.com/#/login");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void enterusername(String username) {
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);

    }

    public void enterpassword(String password) {
        driver.findElement(txtpassword).clear();
        driver.findElement(txtpassword).sendKeys(password);
    }

    public void clickLogin() {
       driver.findElement(btnLogin).click();
    }
    public String getErrorMessage(){
       return driver.findElement(lblLoginErrorMessage).getText();
    }

    public void closeBrowser(){
       driver.quit();
    }
}
