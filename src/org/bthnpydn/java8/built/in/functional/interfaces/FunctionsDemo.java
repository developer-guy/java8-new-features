package org.bthnpydn.java8.built.in.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class FunctionsDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.<Integer>asList(1, 2, 3, 4, 5);

        Function<List<Integer>, Integer> sumOfListValsFunc = (vals) -> {
            Integer sum = 0;
            for (Integer i : vals) {
                sum += i;
            }
            return sum;
        };

        Integer sum = sumOfListValsFunc.apply(integers);

        System.out.println("Sum of " + integers + " is :" + sum);

        Function<String, Integer> stringToIntegerConverter = (str) -> Integer.valueOf(str);

        Function<Integer, String> integerToStringConverter = (intval) -> String.valueOf(intval);

        Function<String, String> stringToStringConverter = stringToIntegerConverter.andThen(integerToStringConverter);

        String andThen = stringToStringConverter.apply("123");

        System.out.println("andThen : " + (andThen + 123));

        Function<Integer, Integer> composeFunc = stringToIntegerConverter.compose(integerToStringConverter);

        Integer compose = composeFunc.apply(123);

        System.out.println("Compose : " + compose);

        BiFunction<List<Integer>, Integer, Boolean> contains = (list, item) -> list.contains(item);

        Boolean isContainFive = contains.apply(integers, 5);

        System.out.println("isContainFive : " + isContainFive);

        IntFunction<String> convertString = String::valueOf;

        UnaryOperator<String> toUpperCase = String::toUpperCase;

        BinaryOperator<Integer> concatStrs = ( str1, str2) -> str1.compareTo(str2);

        ToDoubleFunction toDoubleFunction = (i) -> Double.valueOf(String.valueOf(i));

    }

}
