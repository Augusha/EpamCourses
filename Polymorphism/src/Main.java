public class Main {
    public static void main(String[] args) {
        // creating instance of parent
        int a1 = 4, b1 = 7;
        double a2 = 6.5, b2 = 10.5;
        System.out.println(a1 + " * " + b1 + " = " + Operation.Multiply(a1, b1));
        System.out.println(a2 + " * " + b2 + " = " + Operation.Multiply(a2, b2));
        System.out.println(a1 + " * " + b2 + " = " + Operation.Multiply(a1, b2));
        System.out.println(a2 + " * " + b1 + " = " + Operation.Multiply(a2, b1));
    }
}