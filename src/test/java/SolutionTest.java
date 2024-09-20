import org.example.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testTargetInMiddle() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetNotPresent() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetAtStart() {
        int[] nums = {1, 2, 2, 3, 4};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        int[] nums = {1, 2, 2, 3, 4};
        int target = 4;
        int[] expected = {4, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }

    @Test
    public void testMultipleOccurrences() {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 1;
        int[] expected = {0, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }
    @Test
    public void testTwoSumFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumNotFound() {
        int[] nums = {1, 2, 3, 4};
        int target = 8;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumMultiplePairs() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSumSameElement() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
    @Test
    public void testLengthOfLongestSubstringNormalCase() {
        String input = "abcabcbb";
        int expected = 3;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringWithAllUnique() {
        String input = "abcdefg";
        int expected = 7;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringWithAllSame() {
        String input = "aaaaaa";
        int expected = 1;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringEmptyString() {
        String input = "";
        int expected = 0;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringWithSpaces() {
        String input = "abc ab";
        int expected = 4;
        assertEquals(expected, solution.lengthOfLongestSubstring(input));
    }
}


