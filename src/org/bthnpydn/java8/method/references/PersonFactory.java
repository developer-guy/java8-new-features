package org.bthnpydn.java8.method.references;

/**
 * Created by bapaydin on 20.02.2017.
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P createNewPerson(String firstName,int age);
}
