package org.bthnpydn.java8.method.references;

/**
 * Created by bapaydin on 20.02.2017.
 */
public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }


    public Person(String firstName, int age) {
        this(firstName, null, age);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
