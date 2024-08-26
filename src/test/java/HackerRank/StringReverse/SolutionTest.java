package HackerRank.StringReverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {

    @DisplayName("Test is palindrome if all words pass")
    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "dad"})
    void isPalindrome_pass(String input) {
        Assertions.assertTrue(Solution.isPalindrome(input));
    }

    @DisplayName("Test is palindrome if all words fail")
    @ParameterizedTest
    @ValueSource(strings = {"no", "yes", "one", "obviously"})
    void isPalindrome_fail(String input) {
        Assertions.assertFalse(Solution.isPalindrome(input));
    }

    @DisplayName("Test is palindrom function two if all words pass")
    @ParameterizedTest
    @ValueSource(strings = {"madam", "mom", "dad"})
    void isPalindrome2_pass(String input) {
        Assertions.assertTrue(Solution.isPalindrome2(input));
    }

    @DisplayName("Test is palindrome function 2 if all words fail")
    @ParameterizedTest
    @ValueSource(strings = {"no", "yes", "one", "obviously"})
    void isPalindrome2_fail(String input) {
        Assertions.assertFalse(Solution.isPalindrome2(input));
    }
}