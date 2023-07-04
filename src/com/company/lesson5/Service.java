package com.company.lesson5;


import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Service {

    // Написать метод для поиска самого длинного слова в тексте.
    public String getLongestWord(String text) {
        String[] words = text.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Написать метод, который проверяет является ли слово палиндромом.
    public boolean isPalindrome(String str) {
        String modStr = str.replaceAll("\\s", "").toUpperCase(Locale.ROOT);
        return modStr.equals(new StringBuffer(modStr).reverse().toString());
    }

    // Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
    public String byakaReplacer(String text, String word){
        return text.replaceAll(word, "[вырезано цензурой]");
    }

    // Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
    public int getNumberOfOccurrences(String text, String word){
        String[] wordsArray = text.split(" ");
        List<String> words = Arrays.asList(wordsArray);

        int count = 0;
        for (String s : words) {
            if(s.equalsIgnoreCase(word)){
                count ++;
            }
        }
        return count;
    }

    // Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
    public String getInvertText(String text){
        String[] wordsArray = text.split(" ");
        List<String> words = Arrays.asList(wordsArray);
        StringBuilder newTxt = new StringBuilder();

        for (String s : words) {
            StringBuilder reversedWord = new StringBuilder(s);
            String invertWord = reversedWord.reverse().toString();
            newTxt.append(invertWord).append(" ");
        }
        return newTxt.toString();
    }

}
