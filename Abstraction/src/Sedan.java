public class Sedan extends Car {
private String carName;
   Sedan(String carName)
   {
       this.carName = carName;
   }
    @Override
    void getCarStatus() {
        System.out.println("Седан встряг на бездоріжжі");
    }
    void getPrice() { System.out.println("Скоро в продажі!"); }
}
