package com.hillel.lesson_17.io.FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileStream {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream =
//                new FileInputStream("/Users/stepurkoolksandr/hillel2022winter/winter2022/src/com/hillel/lesson_17/io/FileStream/input.txt");
//        int size = inputStream.available();
//        System.out.println("file size : " + size);
//        for (int i = 0; i < size; i++){
//            System.out.print((char) inputStream.read());
//        }
//        inputStream.close();

        // Output stream
        OutputStream outputStream =
                new FileOutputStream("/Users/stepurkoolksandr/hillel2022winter/winter2022/src/com/hillel/lesson_17/io/FileStream/output.txt");

        String str = "Stepurko Oleksandr";

        outputStream.write(str.getBytes(StandardCharsets.UTF_8));


    }
}
