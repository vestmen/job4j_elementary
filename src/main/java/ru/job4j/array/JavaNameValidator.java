package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        char[] array = name.toCharArray();
        if (name.isEmpty() || Character.isUpperCase(name.charAt(0)) || Character.isDigit(array[0])) {
            valid = false;
        }
        for (int index = 1; index < array.length; index++) {
            if (isSpecialSymbol(index) || isUpperLatinLetter(index) || isLowerLatinLetter(index) || Character.isDigit(index)) {
                valid = true;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
