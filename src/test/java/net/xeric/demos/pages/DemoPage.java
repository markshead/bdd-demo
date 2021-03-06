package net.xeric.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public void addNumbers(int x, int y) {
        driver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(x));
        driver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(y));
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

//    public void convert(int arabicNumber) {
//        driver.findElement(By.id("arabic-number")).sendKeys(Integer.toString(arabicNumber));
//        driver.findElement(By.id("convert")).click();
//    }
//
//    public String getRomanNumeral() {
//        return driver.findElement(By.id("roman-numeral")).getText();
//    }
}
