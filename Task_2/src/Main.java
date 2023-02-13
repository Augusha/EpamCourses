import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");
        cat(file);
    }

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println("An error occurred while closing the file.");
                    e.printStackTrace();
                }
            }
        }
    }
}