package org.example;

public class Calculadora {

    public static <T extends Number> double sum(T... numbers){
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
