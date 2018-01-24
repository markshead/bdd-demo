package net.xeric.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * This is the Spring configuration file that allows us to get the webdriver.
 */
@Configuration
public class TestConfig {

    @Bean(destroyMethod = "quit")
    @Lazy
    @Scope("singleton")
    public WebDriver getWebDriver() {
        //final WebDriver webDriver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/bin/mac/chromedriver");
        final WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }

}
