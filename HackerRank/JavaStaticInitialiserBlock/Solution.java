package HackerRank.JavaStaticInitialiserBlock;

import java.util.Scanner;

public class Solution {
    static int B;
    static int H;

    public static void main(String[] args) throws Exception {
        // technically supposed to handle all of this but meh!
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try {
            System.out.println(Solution.calculateArea(B, H));
        } catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }

    public static int calculateArea(int b, int h) throws Exception {
        if (b > 0 && h > 0) {
            return b * h;
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    }
}
