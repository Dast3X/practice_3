package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PersonEvaluator {
    List<Person> persons = new ArrayList<Person>();

    PersonEvaluator(List<Person> persons) {
        this.persons = persons;
    }

    public void findAndPrint(String startwith) {
        persons.stream()
                .filter(s -> s.getName().startsWith(startwith))
                .forEach(person -> System.out.println(person.getName()));
    }

    public void findAndPrint(int age) {
        persons.stream()
                .filter(person -> person.getAge() > age)
                .forEach(person -> System.out.println(person.getName()));
    }

    public void groupAndPrint(int[] ages) {
        for(int i = 0; i < ages.length; i++){
            System.out.print("Age " + ages[i] + ": ");
            int finalI = i;
            System.out.println(persons.stream()
                    .filter(person -> person.getAge() == ages[finalI])
                    .map(Person::getName)
                    .collect(Collectors.toList()));
        }
    }

    public OptionalDouble getAverageAge() {
    return persons.stream()
            .mapToDouble(person -> person.getAge())
            .average();
    }
}
