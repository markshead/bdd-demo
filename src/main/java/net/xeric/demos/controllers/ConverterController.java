package net.xeric.demos.controllers;

import net.xeric.demos.services.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markshead on 6/14/18.
 */
@RestController
public class ConverterController {

    @Autowired
    ConverterService converterService;

    /*
     @RequestMapping("/convert")
     public String convert(@RequestParam(value="arabicNumber") int i) {
     return "\"1\"";
     }
     */


    /**
     @RequestMapping("/convert") public String convert(@RequestParam(value="arabicNumber") int i) {
     if(i < 1) return "\"error\"";
     return "\"" + converterService.convert(i) + "\"";
     }
     */
}
