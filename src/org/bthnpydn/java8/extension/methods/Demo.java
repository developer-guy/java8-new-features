package org.bthnpydn.java8.extension.methods;

/**
 * Created by bapaydin on 20.02.2017.
 */
public class Demo {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations() {
            @Override
            public int substract(int a, int b) {
                return a - b;
            }
        };

        int substractResult = mathOperations.substract(10, 4);

        int sumResult = mathOperations.sum(5, 6);

        double divideResult = MathOperations.divide(10, 3);

        System.out.println("Result of sum : " + sumResult);
        System.out.println("Result of substract : " + substractResult);
        System.out.println("Result of divide : " + divideResult);
    }
}
