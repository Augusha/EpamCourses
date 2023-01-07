public class Director extends Person {
    private int exp;
    private int salary;
    public Director(String firstname, String surname, int age, int exp, int salary) {
        super(firstname, surname, age);
        this.exp = exp;
        this.salary = salary;
    }
    @Override
    public void about() {
        System.out.println( toString() + "Стаж " + exp + " р. Заробітня плата " + salary + " грн. " +"Я є директором компанії");
    }
}