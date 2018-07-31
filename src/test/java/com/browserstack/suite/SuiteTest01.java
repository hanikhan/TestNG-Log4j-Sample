package com.browserstack.suite;

import com.browserstack.Tests;
import org.apache.log4j.Logger;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.browserstack.BrowserStackTestNGTest;

public class SuiteTest01 extends BrowserStackTestNGTest {

    private Logger logger = Logger.getLogger(SuiteTest01.class);

    @Test
    public void test_01() throws Exception {
        Tests tests=new Tests();
        String sessionID=((RemoteWebDriver)driver).getSessionId().toString();
        String searchTerm="BrowserStack Test 01";
        tests.simpleGoogleTest(driver,sessionID,searchTerm);
        try {
            Assert.assertEquals(searchTerm+" - Google Search", driver.getTitle());
            logger.info(sessionID+" - Assert text \""+searchTerm+" - Google Search\" with page title");
        }catch (Exception e){
            logger.info(sessionID+" - Assert failed text \""+searchTerm+" - Google Search\" with page title");
        }
    }
}
