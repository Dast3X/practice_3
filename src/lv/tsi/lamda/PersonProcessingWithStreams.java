package lv.tsi.lamda;

import java.util.List;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Max", 28),
                new Person("Peter", 22),
                new Person("Anna", 28),
                new Person("Lilianna", 16),
                new Person("Pamela", 13),
                new Person("David", 22));
        PersonEvaluator personEvaluator = new PersonEvaluator(persons);
        personEvaluator.findAndPrint(18);
        System.out.println("");
        personEvaluator.findAndPrint("P");
        System.out.println(personEvaluator.getAverageAge().getAsDouble());
        personEvaluator.groupAndPrint(new int[] {13,16,22});

    }
}
