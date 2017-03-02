package org.bthnpydn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class DifferentKindOfStreamDemo {

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

            Predicate<String> startsWithA = (str) -> str.startsWith("a");

            boolean anyMatchTest = stringCollection.stream().anyMatch(startsWithA);
            boolean allMatchTest = stringCollection.stream().allMatch(startsWithA);
            boolean noneMatchTest = stringCollection.stream().noneMatch(startsWithA);

            System.out.println("anyMatchTest : " + anyMatchTest);
            System.out.println("allMathTest : " + allMatchTest);
            System.out.println("noneMatchTest : " + noneMatchTest);


            long startsWithASize = stringCollection.stream().filter(startsWithA).count();

            System.out.println("startsWithASize : " + startsWithASize);

            Stream<String> stringStream = Stream.of("A", "B", "C");

            Optional<String> first = stringStream.findFirst();

            first.ifPresent(System.out::println);


            IntStream.range(1,4).mapToObj(val -> val + "val").forEach(System.out::println);

            IntStream.range(1,4).average().ifPresent((val) -> System.out.println(val));

    }
}
