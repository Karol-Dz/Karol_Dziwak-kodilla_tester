package com.kodilla.basic_assertion;

    public class Application {

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int sumResult = calculator.sum(a, b);
            int subtractResult = calculator.subtract(a, b);
            int squareResult = calculator.square(a);
            boolean correct = ResultChecker.assertEquals(13, sumResult);
            if (correct) {
                System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
            } else {
                System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            }
            boolean corect = ResultChecker.assertEquals(-3, subtractResult);
            if (corect) {
                System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " +b);
            } else {
                System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " +b);
            }
            boolean correctly = ResultChecker.assertEquals(25, squareResult);
            if (correctly) {
                System.out.println("Metoda square działa poprawnie dla liczby " + a);
            } else {
                System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
            }
        }
    }
