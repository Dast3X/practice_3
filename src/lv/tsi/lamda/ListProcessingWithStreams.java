package lv.tsi.lamda;

import java.util.List;

public class ListProcessingWithStreams {
    public static void main(String[] args) {
        List<String> list = List.of("a1", "c3", "a2", "a3", "b3", "b2", "c1", "c2", "b1");
        System.out.println("Exercise 1\n##################################");
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("Exercise 2\n##################################");
        list.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println("\nExercise 3\n##################################");
        list.stream()
                .filter(s -> s.startsWith("b"))
                .forEach(s -> System.out.print(s + " "));
        System.out.println("\nExercise 4\n##################################");
        list.stream()
                .map(String::toUpperCase)
                .filter(s ->  s.contains("C"))
                .sorted()
                .forEach(s -> System.out.print(s + " "));
    }

}

