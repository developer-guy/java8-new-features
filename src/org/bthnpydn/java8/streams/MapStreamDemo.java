package org.bthnpydn.java8.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by bapaydin on 22.02.2017.
 */
public class MapStreamDemo {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("321321");
        stringCollection.add("412421");
        stringCollection.add("421421");
        stringCollection.add("4214214");
        stringCollection.add("124142");
        stringCollection.add("421412");
        stringCollection.add("421");
        stringCollection.add("421421421");


        Function<String,BigDecimal> convertBigDecimal = BigDecimal::new;

        Predicate<BigDecimal> biggerThenT = (i) -> {
            int result = i.compareTo(new BigDecimal(1000));
            if(result < 0 ){
                return true;
            }
            return false;
        };

        stringCollection.stream().map(convertBigDecimal).filter(biggerThenT).forEach(System.out::println);

    }
}
