package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        String text = name;
        char[] array = text.toCharArray();
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        //- ����� isSpecialSymbol(int code) - ����� ������ ������� true, ���� ������ �������� �������� ������� � ������ �������������;
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        //- ����� isUpperLatinLetter(int code) - ����� ������ ������� true, ���� ������ �������� ��������� ��������� ��������;
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        //- ����� isLowerLatinLetter(int code) - ����� ������ ������� true, ���� ������ �������� �������� ��������� ��������.
        return false;
    }
}
