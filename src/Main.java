import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Кузьма", "Петров Водкин ии", 50));
        people.add(new Person("Кузьма", "Петров Водкин вв", 16));
        people.add(new Person("Кузьма", "Петров Водкин кк", 12));
        people.add(new Person("Кузьма", "Петров Водкин Алексеев", 41));
        people.add(new Person("Чарльз", "Филип Артур Джордж Маунтбеттен Виндзор", 74));
        people.add(new Person("Морена", "Сильва де Ваз Сетта Баккарин", 43));
        people.add(new Person("Билли", "Айлиш Оконнел", 20));

        // Сортировка с учётом макс количества слов
        Collections.sort(people, new PersonsSurnameAgeComparator(4));
        System.out.printf("\nСписок после сортировки :%s.\n", people.toString().replaceAll("\\[|\\]", ""));

        Predicate<Person> ifAge = age -> age.getAge() < 18;
        people.removeIf(ifAge);
        System.out.printf("\nСписок после удаления:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}
