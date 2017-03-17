package com.qa.kau.Domain;
import com.qa.kau.Page.LoginTest;
/**
 * Created by Hash on 12/03/2017.
 */
public class Login {
    LoginTest loginTest = new LoginTest();
    public void login(String username,String password){
        loginTest.enterusername(username);
        loginTest.enterpassword(password);
        loginTest.clickLogin();
    }

    public String getLoginErrorMessage (){
        return loginTest.getErrorMessage();
    }

    public void closeBrowser(){
        loginTest.closeBrowser();
    }
}
