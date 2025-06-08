package fileio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.File;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "/Users/lehuuloc/IdeaProjects/training/javcore55/demoFile";
        File directory = new File(path);
        if (!directory.exists()) {
            Files.createDirectory(Path.of(path));
        }

        String fileTxtPath = path + "/demoFileIO.txt";
        Path filePath = Path.of(fileTxtPath);
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileTxtPath, true);
        PrintWriter out = new PrintWriter(fileOutputStream);
//        out.println("Ca si my tam");
        out.close();


        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileTxtPath)
        );
        bufferedReader.lines().forEach(line -> System.out.println(line));

    }
}
//2.807 bytes (4 KB on disk)
