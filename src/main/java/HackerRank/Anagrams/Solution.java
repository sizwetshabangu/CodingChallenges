package HackerRank.Anagrams;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //Not my code
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        //end Not my code
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();
        java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();
        java.util.Map<Character, Integer> mapB = new java.util.HashMap<>();
        if (a.length() == b.length()) {
            for (int x = 0; x < a.length(); x++) {
                if (!mapA.containsKey(charA[x])) {
                    mapA.put(charA[x], 1);
                } else {
                    int value = mapA.get(charA[x]);
                    mapA.put(charA[x], ++value);
                }
                if (!mapB.containsKey(charB[x])) {
                    mapB.put(charB[x], 1);
                } else {
                    int value = mapB.get(charB[x]);
                    mapB.put(charB[x], ++value);
                }
            }
            return mapA.equals(mapB);
        }

        return false;
    }
}
