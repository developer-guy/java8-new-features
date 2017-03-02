package org.bthnpydn.java8.lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bapaydin on 20.02.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName()+" thread working...");

        runnable.run();

        List<String> letters = Arrays.<String>asList("d", "c", "a", "b");

        Comparator<String> stringComparator = (String str1, String str2) ->  str1.compareTo(str2) ;

        Collections.sort(letters,stringComparator);

        for (String item:letters) {
            System.out.println("İtem :" + item);
        }

        Converter<String,Integer> stringToIntegerConverter = (str) -> Integer.valueOf(str) ;

        Integer converted = stringToIntegerConverter.convert("123");

        Integer defaultConverted = stringToIntegerConverter.defaultConvert("123");

        System.out.println("Result1:" + (converted + 5));
        System.out.println("Result2:" + (defaultConverted + 5));
    }
}
