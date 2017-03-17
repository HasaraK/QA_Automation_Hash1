package com.qa.kau.tests;

import com.qa.kau.Domain.Login;
import com.qa.kau.util.Messages;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.qa.kau.util.SystemConstatnts;

/**
 * Created by Hash on 10/03/2017.
 */


public class LoginTestRun {

    Login login = new Login();

   // @AfterMethod
   // public void cleanup(){




    @Test
    public void testSuccessLogin() {

        login.login(SystemConstatnts.USERNAME, SystemConstatnts.PASSWORD);
    }


    @Test
    public void testLoginWithBlankLogin() {
        login.login("aaa ", SystemConstatnts.PASSWORD);
        Assert.assertEquals(login.getLoginErrorMessage(), Messages.LOGIN_ERROR_MESSAGE);

    }

    @AfterClass
    public  void classCleanUp(){
       login.closeBrowser();

    }



}
// @Test
   // public void testLoginWithInvalidLogin() {
       // login.enterpassword("asdf ");
       // login.enterusername("aruna");
      //  login.clickLogin();
   // }





