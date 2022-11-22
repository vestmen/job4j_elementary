package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passedEuro = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        float inForDollar = 150;
        float expectedDollar = 2.5F;
        float outDollar = Converter.rubleToDollar(inForDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("150 rubles are 2 euro. Test result : " + passedDollar);

    }
}
