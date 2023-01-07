import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person client = new Person("Андрій", "Бойко", 22);
        Person worker = new Worker("Ігор", "Перегінець", 27, 4, 16000);
        Person director = new Director("Олексій", "Шевченко", 42, 7, 27000);

        List<Person> office = Arrays.asList(client, worker, director);
        for (Person d : office) {
            d.about();
        }
    }
}