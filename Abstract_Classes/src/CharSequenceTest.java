import java.util.ArrayList;
import java.util.Collections;

public class CharSequenceTest implements CharSequence {
    // Зберігання рядка як список символів
    private ArrayList<Character> string = new ArrayList<>();

    // Конструктор, який приймає рядок і зберігає його задом-наперед
    public CharSequenceTest(String sentence) {
        for (int i = sentence.length() - 1; i >= 0; i--) {
            string.add(sentence.charAt(i));
        }
    }

    @Override
    public int length() {
        return string.size();
    }

    @Override
    public char charAt(int index) {
        // Повертає символ із заданим індексом
        return string.get(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        // Створення підсписку символів і перевернення його
        ArrayList<Character> subString = new ArrayList<>(string.subList(start, end));
        Collections.reverse(subString);
        // Повертає новий екземпляр CharSequenceTest із підсписком як рядок
        return new CharSequenceTest(subString.toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (char c : string) {
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        CharSequenceTest charSequenceTest = new CharSequenceTest(sentence);
        System.out.println("String: " + charSequenceTest);
        System.out.println("Length: " + charSequenceTest.length());
        System.out.println("Char at 5: " + charSequenceTest.charAt(5));
        System.out.println("Subsequence (10, 15): " + charSequenceTest.subSequence(10, 15));
    }
}