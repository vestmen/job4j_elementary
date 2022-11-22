package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivide(double first, double second) {
        return sum(minus(first, second), divide(first, second));
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + minus(first, second) + multiply(first, second) + divide(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Сумма + произведение двух чисел равна " + sumAndMultiply(10, 20));
        System.out.println("Сумма двух операций: разность двух чисел и деление двух чисел равна " + sumMinusAndDivide(10, 20));
        System.out.println("Сумма вычисления всех четырех операций равна " + sumAll(10, 20));
    }
}
