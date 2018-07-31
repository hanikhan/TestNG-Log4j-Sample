package com.browserstack;

import org.apache.log4j.Logger;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    private Logger logger = Logger.getLogger(SingleTest.class);

    @Test
    public void test() throws Exception {
        Tests tests=new Tests();
        String sessionID=((RemoteWebDriver)driver).getSessionId().toString();
        String searchTerm="BrowserStack";
        tests.simpleGoogleTest(driver,sessionID,searchTerm);
        try {
            Assert.assertEquals(searchTerm+" - Google Search", driver.getTitle());
            logger.info(sessionID+" - Assert text \""+searchTerm+" - Google Search\" with page title");
        }catch (Exception e){
            logger.info(sessionID+" - Assert failed text \""+searchTerm+" - Google Search\" with page title");
        }
    }
}
