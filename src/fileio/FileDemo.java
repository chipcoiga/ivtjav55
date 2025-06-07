package fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
        out.println("Ca si my tam");
        out.close();




    }
}
//2.807 bytes (4 KB on disk)
