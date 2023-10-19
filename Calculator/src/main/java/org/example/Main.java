package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator<Integer> intCalculator = new Calculator<>();

        Operation<Integer> addition = new Operation<Integer>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a + b;
            }
        };

        Operation<Integer> subtraction = new Operation<Integer>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a - b;
            }
        };

        System.out.println("Dodawanie: " + intCalculator.performOperation(5, 3, addition));
        System.out.println("Odejmowanie: " + intCalculator.performOperation(8, 2, subtraction));


        Calculator<Double> doubleCalculator = new Calculator<>();

        Operation<Double> multiplication = (a, b) -> a * b;
        Operation<Double> division = (a, b) -> a / b;

        System.out.println("Mnożenie: " + doubleCalculator.performOperation(4.0, 2.5, multiplication));
        System.out.println("Dzielenie: " + doubleCalculator.performOperation(10.0, 2.0, division));
    }

}