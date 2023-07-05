package com.company.lesson5;

public class Lab5 {
    public static void main(String[] args) {

        Service service = new Service();

        // Написать метод для поиска самого длинного слова в тексте.
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String longestWord = service.getLongestWord(text);
        System.out.println(longestWord);
        System.out.println();


        // Написать метод, который проверяет является ли слово палиндромом.
        String word = "А роза упала на лапу Азора";
        boolean isPalindrome = service.isPalindrome(word);
        if (isPalindrome) {
            System.out.println(word + " является палиндромом.");
        } else {
            System.out.println(word + " не является палиндромом.");
        }
        System.out.println();


        // Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
        String byakaTxt = "Вот такая бяка, забияка бяка";
        String newTxt = service.byakaReplacer(byakaTxt, "бяка");
        System.out.println(newTxt);
        System.out.println();


        // Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
        String occurTxt = "Я пишу на Java - это популярный язык. На java написано множество приложений";
        String repitWord = "jaVa";
        int quantity = service.getNumberOfOccurrences(occurTxt, repitWord);
        System.out.println(quantity);

        // Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
        String checkTxt = "Завтра новый день";
        String invertStr = service.getInvertText(checkTxt);
        System.out.println(invertStr);
    }
}
