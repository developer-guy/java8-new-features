package org.bthnpydn.java8.built.in.functional.interfaces;

import org.bthnpydn.java8.method.references.Person;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Supplier<String>> helloConsumer = (supplier) -> System.out.println("Hello," +supplier.get());

        Supplier<String> stringSupplier = () -> "burak";

        helloConsumer.accept(stringSupplier);

        BiConsumer<String,Person> helloToPerson = (str,p)-> System.out.println(str + "," + p.firstName) ;

        Person person = new Person("Batuhan","Apaydın");

        helloToPerson.accept("Hello",person);
    }
}
