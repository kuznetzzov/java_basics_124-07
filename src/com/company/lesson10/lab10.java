package com.company.lesson10;

import java.util.ArrayList;

public class lab10 {
    public static void main(String[] args) {

        Utils utils = new Utils();

        /**
         * 1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
         */
        ArrayList<String> strings = utils.getStringList("src/resources/file.txt");
        for (String string : strings) {
            System.out.println(string);
        }

        /**
         * 2.	Написать метод, который записывает в файл строку, переданную параметром.
         */
        utils.writeString("Hello Java!", "src/resources/file2.txt");

        /**
         * 3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовых файла один.
         */
        utils.getMerge("src/resources/file.txt", "src/resources/file2.txt", "src/resources/file3.txt");

        /**
         * 4.	Написать метод, который заменяет в файле все кроме букв и цифр на знак ‘$’
         */
        utils.replacer("src/resources/file.txt", "src/resources/replacedFile.txt");

    }
}
