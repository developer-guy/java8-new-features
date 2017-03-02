package org.bthnpydn.java8.built.in.functional.interfaces;

import org.bthnpydn.java8.method.references.Person;

import java.util.function.Supplier;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> intSupplier = () -> 25 ;


        Integer integer = intSupplier.get();

        Supplier<Person> personSupplier =  Person::new;

        Person person = personSupplier.get();

        System.out.println("Value : " + integer);

        System.out.println("Person : " + person);

    }
}
