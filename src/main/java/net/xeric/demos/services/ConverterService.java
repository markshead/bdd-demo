package net.xeric.demos.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by markshead on 6/14/18.
 */
@Service
public class ConverterService {

    /****************************************
     * initial version of conversion service
     * **************************************
    public String convert(int i) {
        return "I";
    }
    */

    /*********************************************
     * Final version of Arabic to Roman algorithm
     *********************************************
    HashMap<Integer,String> table = new LinkedHashMap() {{
        put(1000,"M");
        put(900,"CM");
        put(500,"D");
        put(400,"CD");
        put(100,"C");
        put(90,"XC");
        put(50,"L");
        put(40,"XL");
        put(10,"X");
        put(9,"IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String convert(int i) {
        if(i == 0) return "";
        Integer key = table.keySet().stream().filter(x -> x <= i).findFirst().get();
        return table.get(key) + convert(i - key);
    }

     */
}
