package net.xeric.demos.controllers;

import net.xeric.demos.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by markshead on 6/14/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConverterControllerIT {
    @Autowired
    ConverterController converterController;

    /* Just to keep Junit from complaining when there are no other tests */
    @Test
    public void testTrivial() {
        assertTrue(true);
    }

/*
    @Test
    public void testConversion() {
        assertEquals("\"I\"", converterController.convert(1));
    }
*/

/*
    @Test
    public void testConversion() {
        assertEquals("\"V\"", converterController.convert(5));
    }
*/

/*
    @Test
    public void testConversion() {
        assertEquals("\"MMMCMXCIX\"", converterController.convert(3999));
    }
*/

/*
    @Test
    public void testZero() { assertEquals("\"error\"", converterController.convert(0));}
*/

/*
    @Test
    public void testTooLarge() { assertEquals("\"error\"", converterController.convert(4000));}
*/

}
