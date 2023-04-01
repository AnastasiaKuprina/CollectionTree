import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Кузьма", "Петров Водкин ии", 50));
        people.add(new Person("Кузьма", "Петров Водкин вв", 51));
        people.add(new Person("Кузьма", "Петров Водкин кк", 52));
        people.add(new Person("Кузьма", "Петров Водкин Алексеев", 41));
        people.add(new Person("Чарльз", "Филип Артур Джордж Маунтбеттен Виндзор", 74));
        people.add(new Person("Морена", "Сильва де Ваз Сетта Баккарин", 12));
        people.add(new Person("Билли", "Айлиш Оконнел", 17));

        Comparator<Person> PersonsSurnameAgeComparator = (o1, o2) -> {
            if (o1.getSurnameSet().size() == o2.getSurnameSet().size()
                    || (!(o1.getSurnameSet().size() < 4)
                    && o2.getSurnameSet().size() >= 4))
                return Integer.compare(o1.getAge(), o2.getAge());
            else return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
        };

        // Сортировка по количеству слов в фамилии
        Collections.sort(people, PersonsSurnameAgeComparator);
        System.out.printf(people.toString().replaceAll("\\[|\\]", ""));

    }
}
