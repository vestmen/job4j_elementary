package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        String text = name;
        char[] array = text.toCharArray();
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        //- метод isSpecialSymbol(int code) - метод должен вернуть true, если символ является символом доллара и нижнее подчеркивание;
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        //- метод isUpperLatinLetter(int code) - метод должен вернуть true, если символ является прописным латинским символом;
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        //- метод isLowerLatinLetter(int code) - метод должен вернуть true, если символ является строчным латинским символом.
        return false;
    }
}
