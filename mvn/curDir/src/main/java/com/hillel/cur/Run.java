package main.java.com.hillel.cur;

import java.io.File;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);

        File file = new File(userDirectory);

        DirectoryService ds = new DirectoryService();

        List<File> files = ds.directoryContent(file.getAbsolutePath());

        ds.printDir(files);

    }
}
