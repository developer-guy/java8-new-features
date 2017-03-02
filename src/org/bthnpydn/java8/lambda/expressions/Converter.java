package org.bthnpydn.java8.lambda.expressions;

/**
 * Created by bapaydin on 20.02.2017.
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
    default T defaultConvert(F f){
        return convert(f);
    }

    static void sum(){
        System.out.println("asdsa");
    }
}
