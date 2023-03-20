import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Кузьма", "Петров Водкин ии", 50));
        people.add(new Person("Кузьма", "Петров Водкин вв", 51));
        people.add(new Person("Кузьма", "Петров Водкин кк", 52));
        people.add(new Person("Кузьма", "Петров Водкин Алексеев", 41));
        people.add(new Person("Чарльз", "Филип Артур Джордж Маунтбеттен Виндзор", 74));
        people.add(new Person("Морена", "Сильва де Ваз Сетта Баккарин", 43));
        people.add(new Person("Билли", "Айлиш Оконнел", 20));


        // Задача №1. Сортировка по количеству слов в фамилии
        Collections.sort(people, new PersonsSurnameAgeComparator(0));// Задача 1
        System.out.printf("\nЗадача №1 :%s.\n", people.toString().replaceAll("\\[|\\]", ""));

        // Задача №2. Сортировка с учётом макс количества слов
        Collections.sort(people, new PersonsSurnameAgeComparator(4));// Задача 2
        System.out.printf("\nЗадача №2 :%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}
