package omar.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    @DisplayName("Example 1")
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0,1},twoSum.twoSum(nums,target));
        assertArrayEquals(new int[]{0,1},twoSum.bestTwoSum(nums,target));
    }

    @Test
    @DisplayName("Example 2")
    void twoSum2() {
        int [] nums = {3,2,4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{1,2},twoSum.twoSum(nums,target));
        assertArrayEquals(new int[]{1,2},twoSum.bestTwoSum(nums,target));
    }

    @Test
    @DisplayName("Example 3")
    void twoSum3() {
        int [] nums = {3,3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0,1},twoSum.twoSum(nums,target));
        assertArrayEquals(new int[]{0,1},twoSum.bestTwoSum(nums,target));
    }

    @Test
    @DisplayName("Example 4")
    void twoSum4() {
        int [] nums = {3,2,3};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{0,2},twoSum.bestTwoSum(nums,target));
    }

    @Test
    @DisplayName("The best algorimt two sum")
    void bestTwoSum() {
        int [] nums = {3,2,4};
        int target = 6;

        int [] nums2 = {3,2,3};
        int target2 = 6;

        int[] nums3 = {2, 7, 11, 15};
        int target3 = 9;

        TwoSum twoSum = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, twoSum.bestPerformanTwoSum(nums,target));
        assertArrayEquals(new int[]{0, 2}, twoSum.bestPerformanTwoSum(nums2,target2));
        assertArrayEquals(new int[]{0, 1}, twoSum.bestPerformanTwoSum(nums3,target3));
    }
}