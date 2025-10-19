package org.example;

// EvenOddChecker.java
public class EvenOddChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java EvenOddChecker <число>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (isEven(number)) {
                System.out.println(number + " - чётное число");
            } else {
                System.out.println(number + " - нечётное число");
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа");
        }
    }
}