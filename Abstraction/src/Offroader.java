public class Offroader extends Car {
   private String carName;
   private int price;
    Offroader(String carNam, int price)
    {
       this.carName = carName;
       this.price = price;
    }
    @Override
    void getCarStatus() {
        System.out.println("Позашляховик проїхав бездоріжжя");
    }
    void getPrice() { System.out.println("Ціна: " + price +"$\n"); }
}
