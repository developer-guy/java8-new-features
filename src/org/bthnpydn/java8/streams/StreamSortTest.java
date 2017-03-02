package org.bthnpydn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class StreamSortTest {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        long start = System.nanoTime();

        long count1 = values.parallelStream().sorted().count();//stream ve paralelStream olarak dene!.
        System.out.println("Count : " + count1);

        long end = System.nanoTime();

        long l = TimeUnit.NANOSECONDS.toMillis((end - start));

        System.out.println(String.format("Sequential sort took : %d ms", l));


    }
}
