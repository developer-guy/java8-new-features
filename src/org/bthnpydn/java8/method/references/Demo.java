package org.bthnpydn.java8.method.references;

import org.bthnpydn.java8.lambda.expressions.Converter;

/**
 * Created by bapaydin on 20.02.2017.
 */
public class Demo {
    public static void main(String[] args) {

        Converter<String, Integer> stringToInteger = Integer::valueOf;

        Integer converted = stringToInteger.convert("123");

        System.out.println("Converted :" + converted);

        PersonFactory<Person> personFactory = Person::new;

        Person newPerson = personFactory.createNewPerson("Batuhan",121);

        System.out.println("Person : " + newPerson);

        StringOperations stringOperations = new StringOperations();

        Converter<Integer, String> integerToString = stringOperations::convertIntegerToString ;

        String converted2 = integerToString.convert(123);

        System.out.println("Converted2 :" + converted2);
    }
}
