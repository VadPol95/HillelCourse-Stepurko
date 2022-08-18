package com.hillel;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Oleksandr Stepurko
 * @since 0.0.1
 */
public class Run {
    /**
     * @param args - program input parameters
     */
    public static void main(String[] args) throws Exception {

        Locale locale = Locale.getDefault();
        if (args.length == 1)
            locale = new Locale(args[0]);
        ResourceBundle rb = ResourceBundle.getBundle("demo", locale);
        System.out.println(rb.getString("hello"));
    }
}
