import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)]));

            long count = persons.stream()
                    .filter(age -> age < 18)
                    .count();
            System.out.println(count);
            persons.stream()
                    .filter(age -> age > 17)
                    .filter(age -> age < 28)
                    .filter(value -> value.sex() = Sex.MAN)
                    .map(x.getFamily() + x.getAge())
                    .collect(Collectors.toList());
            System.out.println(persons);
            persons.stream()
                    .filter(age -> age > 16)
                    .filter(age -> age < 60)
                    .filter(value -> value.education() = Education.wHIGHER)
                    .sorted(Comparator.comparing(Person::getFamily))
                    .collect(Collectors.toList());
            System.out.println(persons);
        }
    }
}