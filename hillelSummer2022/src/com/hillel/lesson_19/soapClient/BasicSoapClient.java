package com.hillel.lesson_19.soapClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicSoapClient {

    public static void main(String[] args) {

        String send = "";
        String url = "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5"; //endpoint
        String result = "";
        String username="";
        String password="";
        String[] command = {"curl", "-u", username+":"+password ,"-X", "GET", "-H", "Content-Type: text/xml", "-d", send, url};
        ProcessBuilder process = new ProcessBuilder(command);
        Process p;
        try {
            p = process.start();
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ( (line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            result = builder.toString();
        }
        catch (IOException e)
        {   System.out.print("error");
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
