package net.xeric.demos;

import net.xeric.demos.pages.DemoPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/2/16.
 *
 * Simple test of Page Object. If this doesn't work, then Cucumber/Selenium tests that use
 * Page Objects probably aren't going to work either.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoPageIT {

    @Autowired
    DemoPage demoPage;

    @Test
    public void simpleTest() throws Exception {
        demoPage.go();
        demoPage.addNumbers(5,5);
        assertEquals(10, demoPage.getAdderResults());
    }

    @Autowired
    WebDriver driver;

    @Autowired
    Environment env;

    @Test
    public void simpleButHarderToMaintainTest() throws Exception {
        driver.get("http://localhost:" + env.getProperty("local.server.port") + "/");
        driver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(5));
        driver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(5));
        driver.findElement(By.id("adder-button")).click();
        WebElement resultEl = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("adder-result")));
        assertEquals("10", resultEl.getText());
    }

}
