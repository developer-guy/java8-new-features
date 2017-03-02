package org.bthnpydn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class ForeachStreamDemo {
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


        Consumer<String> printConsumer = (str) -> {
            int index = stringCollection.indexOf(str);
            System.out.println("İtem " + index + ":" + str);
        };

        stringCollection.forEach(printConsumer);
    }
}
