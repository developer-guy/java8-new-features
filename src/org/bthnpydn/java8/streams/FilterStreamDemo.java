package org.bthnpydn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class FilterStreamDemo {
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

        Predicate<String> startsWithA = (str) -> str.startsWith("a") ;

        Consumer<String> printConsumer = System.out::println;

        stringCollection.stream().filter(startsWithA).forEach(printConsumer);
    }
}
