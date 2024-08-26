package HackerRank;

import HackerRank.JavaStaticInitialiserBlock.Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    int B;
    int H;

    @AfterEach
    void afterEach(){
        B=0;
        H=0;
    }

    @Test
    @DisplayName("Test calculate area when both are positive")
    void calculateArea_pass_both_positive() throws Exception {
        B=3;
        H=1;
        int area = B*H;
        int answer = Solution.calculateArea(B,H);
        Assertions.assertEquals(area, answer);
    }

    @Test
    @DisplayName("Test calculate area when one is positive")
    void calculateArea_fail_one_negative() throws Exception {
        B=3;
        H=-1;
        Assertions.assertThrows(Exception.class, ()->Solution.calculateArea(B,H));
    }

    @Test
    @DisplayName("Test calculate area when both are negative")
    void calculateArea_fail_both_negative() throws Exception {
        B=-3;
        H=-1;
        Assertions.assertThrows(Exception.class, ()->Solution.calculateArea(B,H));
    }


}