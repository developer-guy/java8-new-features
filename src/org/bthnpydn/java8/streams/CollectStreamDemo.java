package org.bthnpydn.java8.streams;

import org.bthnpydn.java8.method.references.Person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class CollectStreamDemo {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        List<String> startsWithAList = stringCollection.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());

        startsWithAList.stream().forEach(System.out::println);

        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

        List<Person> filtered = persons.stream().filter(p -> p.firstName.startsWith("P")).collect(Collectors.toList());

        System.out.println(filtered);

        Function<Person, Integer> groupingByFunc = p -> p.age;

        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(groupingByFunc));

        BiConsumer<Integer, List<Person>> mapConsumer = (i, v) -> System.out.println("Age : " + i + " List : " + v);

        personsByAge.forEach(mapConsumer);

        ToIntFunction<Person> personToIntFunction = (p) -> p.age;

        IntSummaryStatistics statistics = persons.stream().collect(Collectors.summarizingInt(personToIntFunction));

        System.out.println(statistics);

        Map<String, Integer> personMap = persons.stream().collect(Collectors.toMap(p -> p.firstName, p -> p.age));

        System.out.println(personMap);
    }
}
