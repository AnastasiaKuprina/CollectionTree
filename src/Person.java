import java.util.*;
public class Person {
    private String name;
    private String surname;
    private int age;

    private List<String> surnameSet = new ArrayList<>();


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        Collections.addAll(this.surnameSet, surname.split("\\P{IsAlphabetic}+"));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSurnameSet() {
        return surnameSet;
    }

    // создайте toString
    @Override
    public String toString() {
        return String.format("\n%s %s - %d лет", getName(), getSurname(), getAge());
    }
}