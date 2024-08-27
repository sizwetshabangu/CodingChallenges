package HackerRank.StringsToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    /**
     * Sample Input
     * He is a very, very good boy, isn't he?
     * Sample Output
     * 10
     * He
     * is
     * a
     * very
     * very
     * good
     * boy
     * isn
     * t
     * he
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        // Write your code here.
        List<String> words = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int totalNumberOfTokens = 0;
        for (int counter = 0; counter < sentence.length(); counter++) {
            if (sentence.charAt(counter) == '?' ||
                    sentence.charAt(counter) == '!' ||
                    sentence.charAt(counter) == ',' ||
                    sentence.charAt(counter) == '.' ||
                    sentence.charAt(counter) == ' ' ||
                    sentence.charAt(counter) == '\'') {
                totalNumberOfTokens++;
                if (!stringBuilder.isEmpty()) {
                    words.add(stringBuilder.toString());
                }
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(sentence.charAt(counter));
            }
        }
        System.out.println(totalNumberOfTokens);
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}

