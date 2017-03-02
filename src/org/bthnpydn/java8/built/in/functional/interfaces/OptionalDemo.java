package org.bthnpydn.java8.built.in.functional.interfaces;

import java.util.Optional;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Batuhan");

        String val = optional.get();

        optional = Optional.empty();
        String defaultStrIfOptionIsEmpty = optional.orElse("Default");
        boolean isPresent = optional.isPresent();

        System.out.println("Value : " + val);
        System.out.println("Ispresent : " + isPresent);
        System.out.println("Default value : " + defaultStrIfOptionIsEmpty);

        optional.ifPresent((str) -> System.out.println("Str : " + str));
    }
}
