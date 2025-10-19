package org.example;

// PalindromeChecker.java
public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Использование: java PalindromeChecker <строка>");
            return;
        }

        String input = args[0];

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" - это палиндром");
        } else {
            System.out.println("\"" + input + "\" - это не палиндром");
        }
    }
}