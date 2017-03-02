package org.bthnpydn.java8.improvements;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((i, v) -> System.out.println(i + "-" + v));

        String present = map.computeIfPresent(3, (i, v) -> i + v);
        System.out.println(present);

        String absent = map.computeIfAbsent(23, (i) -> "val" + i);
        System.out.println(absent);

        boolean containsKey = map.containsKey(23);
        System.out.println(containsKey);

        String orDefault = map.getOrDefault(10, "not found");
        System.out.println(orDefault);
    }
}
