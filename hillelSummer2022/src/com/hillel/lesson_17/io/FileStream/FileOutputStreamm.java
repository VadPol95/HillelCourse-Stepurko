package com.hillel.lesson_17.io.FileStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamm {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream =
                new FileOutputStream("/Users/stepurkoolksandr/hillel2022winter/winter2022/src/com/hillel/lesson_17/io/FileStream/output.txt", true);

        outputStream.write("override\n".getBytes(StandardCharsets.UTF_8));
    }
}
