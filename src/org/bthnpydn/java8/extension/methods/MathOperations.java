package org.bthnpydn.java8.extension.methods;

/**
 * Created by bapaydin on 20.02.2017.
 */
public interface MathOperations {
    default int sum(int a, int b) {
        return a + b;
    }

    int substract(int a, int b);

    static double divide(int a, int b) {
        return (double) a / b;
    }

}
