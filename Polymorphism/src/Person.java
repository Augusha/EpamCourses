class Person {
    private String firstname;
    private String surname;
    private int age;

    public Person(String firstname, String surname, int age) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    }

    public void about() {
        System.out.println(toString() + "Я є клієнтом.");
    }
    @Override
    public String toString() {
        return "Я " + firstname + " " + surname+", мені " + age + " р. ";
    }
}