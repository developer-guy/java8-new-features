package org.bthnpydn.java8.streams;

import org.bthnpydn.java8.method.references.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class SortedStreamDemo {
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


        stringCollection.stream().sorted().forEach(System.out::println);
    }
}
