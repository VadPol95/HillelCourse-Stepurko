package com.hillel.lesson_02;

import java.util.Locale;
import java.util.Objects;

public class Str {
    public static void main(String[] args) {

        String str1 = "String";
        String str2 = new String("new String");
        String str3 = new String(new char[]{'S', 't', 'r', 'i', 'n', 'g'});
        String str4 = new String(new char[]{'S', 't', 'r', 'i', 'n', 'g'}, 3,3);

//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//

//        System.out.println(str1.length());
//        System.out.println(str1.toCharArray());
//        System.out.println("------");
//        for (char c : str1.toCharArray()) System.out.println(c);
//
//        String st = "   ";
//        System.out.println(st.length());
//        System.out.println(st.isEmpty());
//        System.out.println(st.isBlank());
//
//        String s = null;
//        System.out.println(Objects.isNull(s));
//
//        System.out.println(str1.concat(" ").concat(str2));
//
//        System.out.println(str1 + " " + str2);
//

//        byte b =10;
//        System.out.println(String.valueOf(3_000_000_000L));
//
//        System.out.println(String.join(", ", str1, str2, str3, str4));
//
//        System.out.println(str1.compareTo("String 1"));
//
//        System.out.println("---------");
//
//        System.out.println("string".equals("string"));
//        System.out.println("String".equals("string"));
//        System.out.println("String".toLowerCase(Locale.ROOT).equals("string".toLowerCase(Locale.ROOT)));
//        System.out.println("String".toUpperCase(Locale.ROOT).equals("string".toUpperCase(Locale.ROOT)));
//        System.out.println("String".equalsIgnoreCase("string"));
//
//
//        String tr = "   123   ";
//        System.out.println("<" + tr + ">");
//        System.out.println("<" + tr.trim() + ">");
//        System.out.println("<" + "StRiNg".toLowerCase() + ">");
//        System.out.println("<" + "StRiNg".toUpperCase() + ">");
//
//        String rd = "";
//        System.out.println(rd == null);
//        System.out.println(Objects.isNull(rd));
//        System.out.println(Objects.nonNull(rd));
//        System.out.println(rd.isEmpty());
//        System.out.println(rd.isBlank());

//        System.out.println(str1.length());
//        System.out.println(str1.charAt(str1.length() - 1));
//        System.out.println(str1.indexOf("y"));

        String telNumber = "380506754321";

        System.out.println(telNumber.startsWith("380"));
    }
}

