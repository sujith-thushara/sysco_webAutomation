package com.sysco.webAutomation.tests;


import com.sysco.webAutomation.data.LoginData;
import com.sysco.webAutomation.functions.Login;
import com.sysco.webAutomation.utils.ExcelUtil;
import com.sysco.webAutomation.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @Test
    public void testLogin() throws Exception {

        // Sample way to retrive data from excel
        LoginData loginData = ExcelUtil.getLoginData("$as238l");

        //UI Automation  sample
        Login.loadLoginPage();
        Login.quiteDriver();

    }
}