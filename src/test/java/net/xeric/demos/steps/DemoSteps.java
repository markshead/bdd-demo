package net.xeric.demos.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.xeric.demos.CucumberConfiguration;
import net.xeric.demos.DemoApplication;
import net.xeric.demos.pages.DemoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;


/**
 * Created by markshead on 4/2/16.
 */

@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = {CucumberConfiguration.class})
public class DemoSteps {
    int count = 0;

    @Autowired
    DemoPage demoPage;

    @Given("^I am on the demo page$")
    public void i_am_on_the_demo_page() throws Throwable {
        demoPage.go();
    }

    @When("^I add the numbers (-?\\d+) and (-?\\d+)$")
    public void i_add_the_numbers_and(int firstAddend, int secondAddend) throws Throwable {
       demoPage.addNumbers(firstAddend, secondAddend);
    }

    @Then("^the result is (-?\\d+)$")
    public void the_result_is(int sum) throws Throwable {
        assertEquals(demoPage.getAdderResults(), sum);
    }

    @When("^the counter is called$")
    public void the_counter_is_called() throws Throwable {
        count = demoPage.getCount();
        demoPage.clickIncrement();
    }

    @Then("^the count increases$")
    public void the_count_increases() throws Throwable {
        assertEquals(count + 1, demoPage.getCount());
    }

    /****************************************************
     * Steps Definitions for Arabic to Roman conversion
     * **************************************************

    @When("^I convert the arabic number (\\d+)$")
    public void i_convert_the_arabic_number(int arabicNumber) throws Exception {
        demoPage.convert(arabicNumber);
    }

    @Then("^the roman numeral displayed is (\\w+)$")
    public void the_roman_numeral_displayed_is(String romanNumeral) throws Exception {
        assertEquals(romanNumeral, demoPage.getRomanNumeral());
    }
    */
}
