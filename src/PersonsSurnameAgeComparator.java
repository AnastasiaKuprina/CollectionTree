import java.util.Comparator;

public class PersonsSurnameAgeComparator implements Comparator<Person> {
    private int maxWord;

    public PersonsSurnameAgeComparator(int maxWord) {
        this.maxWord = maxWord;
    }

    @Override
    public int compare(Person o1, Person o2) {

        // Задача №1
        if (maxWord == 0) {

            if (o1.getSurnameSet().size() == o2.getSurnameSet().size()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
            }

        // Задача №2
        } else {

            if (o1.getSurnameSet().size() == o2.getSurnameSet().size()
                    || (!(o1.getSurnameSet().size() < maxWord)
                    && o2.getSurnameSet().size() >= maxWord)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return Integer.compare(o1.getSurnameSet().size(), o2.getSurnameSet().size());
            }
        }
    }
}
