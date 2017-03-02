package org.bthnpydn.java8.built.in.functional.interfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<String> isStringEmpty = (str) -> str.isEmpty();

        boolean isStringEmptyTest = isStringEmpty.test("");

        System.out.println("isStringEmptyTest : " + isStringEmptyTest);

        Predicate<String> isStringNotEmpty = isStringEmpty.negate();

        boolean isStringNotEmptyTest = isStringNotEmpty.test("");

        System.out.println("isStringNotEmptyTest : " + isStringNotEmptyTest);

        Predicate<String> lengthIsFive = (str) -> str.length() == 5;

        Predicate<String> isStringNotEmptyAndLengthIsFive = isStringNotEmpty.and(lengthIsFive);

        boolean isStringNotEmptyAndLengthIsFiveTest = isStringNotEmptyAndLengthIsFive.test("Batuş");

        System.out.println("isStringNotEmptyAndLengthIsFiveTest : " + isStringNotEmptyAndLengthIsFiveTest);

        IntPredicate isBiggerThanTen = (i) -> i >= 10;


        boolean isBiggerThanTenTest = isBiggerThanTen.test(15);

        System.out.println("isBiggerThanTenTest : " + isBiggerThanTenTest);

        BiPredicate<String, CharSequence> containsTest = (str1, str2) -> str1.contains(str2);

        CharSequence letter = "t";
        String name = "Batuhan";

        boolean isContain = containsTest.test(name, letter);
        System.out.println("İscontain : " + isContain);
    }
}
