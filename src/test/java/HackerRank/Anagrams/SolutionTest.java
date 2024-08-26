package HackerRank.Anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    String word;
    String supposedAnagram;
    @BeforeEach
    public void setUp() {
        word = "";
        supposedAnagram = "";
    }

    @Test
    void isAnagram_when_anagram() {
        word = "anagram";
        supposedAnagram = "margana";
        Assertions.assertTrue(Solution.isAnagram(word, supposedAnagram));

    }

    @Test
    void isAnagram_when_same_word() {
        word = "anagram";
        supposedAnagram = "anagram";
        Solution.isAnagram(word, supposedAnagram);
    }

    @Test
    @DisplayName("Test is anagram when both provided words are empty")
    void isAnagram_when_empty() {
        word = "";
        supposedAnagram = "";
        Solution.isAnagram(word, supposedAnagram);
    }

    @Test
    @DisplayName("Test is anagram when both provided are not words")
    void isAnagram_when_not_word() {
        word = "..,";
        supposedAnagram = ",..";
        Solution.isAnagram(word, supposedAnagram);
    }
}