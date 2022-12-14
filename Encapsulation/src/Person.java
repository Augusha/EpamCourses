public class Person {
    protected String name, surname;
    protected int age;
Person(String name, String surname, int age)
{
    this.age = age;
    this.name = name;
    this.surname = surname;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name = name;
}
public String getSurname()
{
        return surname;
}
public void setSurname(String surname)
{
    this.surname = surname;
}
public int getAge()
{
    return age;
}
public void setAge(int age)
    {
        this.age = age;
    }
    public String Output()
    {
        return "\nName: " + name + "\nSurname: " + surname + "\nAge: " + age + " years old";
    }
}


