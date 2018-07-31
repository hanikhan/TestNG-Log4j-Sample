package com.browserstack;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tests {

    private Logger logger = Logger.getLogger(Tests.class);

    public void simpleGoogleTest(WebDriver driver, String sessionID, String searchTerm) throws InterruptedException {
        driver.get("https://www.google.com/ncr");
        logger.info(sessionID+" - Open Google homepage");
        WebElement element = driver.findElement(By.name("q"));
        logger.info(sessionID+" - find Element by name 'q'");
        element.sendKeys(searchTerm);
        logger.info(sessionID+" - SendKeys : "+searchTerm);
        element.submit();
        logger.info(sessionID+" - use submit on Element");
        Thread.sleep(5000);
        logger.info(sessionID+" - Adding 5 seconds sleep");
    }
}
