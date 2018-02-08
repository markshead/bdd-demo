package net.xeric.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * This represents a page in the application. Ideally we want to isolate all the details
 * about the page to this class. That way if we change an id or class name, there is just
 * a single place where we have to update it and our step files can remain unchanged.
 */

@Component
//@Scope(value = "prototype")
public class DemoPage {

    private WebDriver driver;

    private Environment env;

    @Autowired
    public DemoPage(final WebDriver driver, Environment env) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.env = env;
    }

    public void go() {
        driver.get("http://localhost:" + env.getProperty("local.server.port") + "/");
    }

    public void setValue(String fieldId, int value){
        WebElement el = driver.findElement(By.id(fieldId));
        el.clear();
        el.sendKeys(Integer.toString(value));

    }

    public void addNumbers(int x, int y) {
        setValue("adder-first-number", x);
        setValue("adder-second-number", y);
        driver.findElement(By.id("adder-button")).click();
    }

    public int getAdderResults() {
        WebElement resultEl = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("adder-result")));
        return Integer.parseInt(resultEl.getText());
    }

    public int getCount() {
        return Integer.parseInt(driver.findElement(By.id("counter")).getText());
    }

    public void clickIncrement() {
        driver.findElement(By.id("increment-button")).click();
    }

}
