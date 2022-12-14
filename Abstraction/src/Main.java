public class Main {
    public static void main(String[] args)
    {
        Offroader toyota = new Offroader("Toyota", 10000);
        toyota.getCarStatus();
        toyota.getPrice();

        Sedan audi = new Sedan("Audi");
        audi.getCarStatus();
        audi.getPrice();
    }
}