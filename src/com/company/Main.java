package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1\tВывести количество символов в тексте\n" +
                "2\tВывести количество слов в тексте\n" +
                "3\tВывести количество строк в тексте\n" +
                "4\tВывести максимальную длину строки в тексте\n" +
                "5\tПеревести текст в верхний регистр\n" +
                "6\tПеревести текст в нижний регистр\n");
        String text = scanner.nextLine();
        String op = scanner.nextLine();

        System.out.println("------");
        opOnLines(text, op);
    }

    public static void opOnLines(String text, String op) {
        switch (op.trim()) {
            case "1":
                System.out.println(text.length());
                break;
            case "2":
                System.out.println(text.split(" ").length);
                break;
            case "3":
                System.out.println(text.split("\n").length);
                break;
            case "4":
                int max = 0;
                for (String str : text.split("\n")) {
                    if (str.length() > max) {
                        max = str.length();
                    }
                }
                System.out.println(max);
                break;
            case "5":
                System.out.println(text.toUpperCase());
                break;
            case "6":
                System.out.println(text.toLowerCase());
                break;
            default:
                System.out.println("incorrect operation");
        }
    }
}
