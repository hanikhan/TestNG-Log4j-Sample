package com.browserstack;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    private Logger logger = Logger.getLogger(LocalTest.class);

    @Test
    public void test() throws Exception {
        driver.get("http://bs-local.com:45691/check");
        logger.info(((RemoteWebDriver)driver).getSessionId().toString()+" - Open bs-local.com:45691");

        try {
            Assert.assertTrue(driver.getPageSource().contains("Up and running"));
            logger.info(((RemoteWebDriver)driver).getSessionId().toString()+" - Assert Text \"Up and running\"");
        }catch (Exception e){
            logger.info(((RemoteWebDriver)driver).getSessionId().toString()+" - Assert Text Does not match \"Up and running\"");
        }
    }
}
