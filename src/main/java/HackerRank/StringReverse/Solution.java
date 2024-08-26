package HackerRank.StringReverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        if (Solution.isPalindrome(A)) {
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
}
