package org.example;

// TemperatureConverter.java
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование: java TemperatureConverter <температура> <единица>");
            System.out.println("Единицы: C (Цельсий), F (Фаренгейт)");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);
            String unit = args[1].toUpperCase();
            double converted;

            if (unit.equals("C")) {
                converted = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f°C = %.2f°F%n", temperature, converted);
            } else if (unit.equals("F")) {
                converted = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f°F = %.2f°C%n", temperature, converted);
            } else {
                System.out.println("Неизвестная единица измерения: " + unit);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат температуры");
        }
    }
}