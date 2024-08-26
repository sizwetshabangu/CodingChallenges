package HackerRank.StringReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        if (Solution.isPalindrome2(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        char[] characterArray = new char[word.length()];
        for (int x = word.length() - 1; x >= 0; x--) {
            characterArray[word.length() - 1 - x] = word.charAt(x);
        }
        String otherWord = new String(characterArray);
        return otherWord.equals(word);
    }

    public static boolean isPalindrome2(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
