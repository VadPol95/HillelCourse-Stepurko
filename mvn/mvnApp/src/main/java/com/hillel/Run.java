package com.hillel;

/**
 * @author Oleksandr Stepurko
 * @since 0.0.1
 */
public class Run {
    /**
     * @param args - program input parameters
     */
    public static void main(String[] args) {
       if (args.length == 1) {
           System.out.println(args[0]);
       } else {
           System.out.println("add correct value");
       }
    }
}
