package com.hillel.lesson_17.io.byteSteram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {

        try(
//                FileInputStream fis = new FileInputStream("hillelSummer2022/src/com/hillel/lesson_17/io/byteSteram/input.txt"); // -> from
//                FileOutputStream fos = new FileOutputStream("hillelSummer2022/src/com/hillel/lesson_17/io/byteSteram/output.txt");
                FileInputStream fis = new FileInputStream("hillelSummer2022/src/com/hillel/lesson_17/io/byteSteram/plain.jpg"); // -> from
                FileOutputStream fos = new FileOutputStream("hillelSummer2022/src/com/hillel/lesson_17/io/byteSteram/plane_pld.jpg");
                ) {

            int a;
            while ((a = fis.read()) != -1) {
                fos.write(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
