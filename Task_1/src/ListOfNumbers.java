import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {
    private final List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void readList(String filename) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("numbers.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                int value = Integer.parseInt(line);
                System.out.println("Read value: " + value);
                list.add(value);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Caught FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.err.println("Caught IOException when closing BufferedReader: " + e.getMessage());
            }
        }
    }
    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    public static void main(String[] args) {
        ListOfNumbers numbers = new ListOfNumbers();
        numbers.writeList();
        numbers.readList("numbers.txt");
    }
}