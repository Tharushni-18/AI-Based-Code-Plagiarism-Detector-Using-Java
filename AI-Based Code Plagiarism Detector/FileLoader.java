import java.nio.file.*;

public class FileLoader {
    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return "";
        }
    }
}