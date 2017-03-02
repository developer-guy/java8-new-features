package org.bthnpydn.java8.streams;

import org.bthnpydn.java8.method.references.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class ReduceStreamDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

        Optional<Person> personOptional = persons.stream().reduce((p1, p2) ->{
            if(p1.age > p2.age){
                return p1;
            }
            return p2 ;
        });

        personOptional.ifPresent(System.out::println);

        Person person = persons.stream().reduce(new Person("", 0), (p1, p2) -> {
            p1.age += p2.age;
            p1.firstName += p2.firstName;
            return p1;
        });

        System.out.println(person.firstName + " " + person.age);

        List<String> strings = Arrays.asList("Batuhan", "APaydın", "David");

        String reduce = strings.stream().reduce("", (str1, str2) -> str1 + "." + str2);

        System.out.println(reduce);
    }
}
