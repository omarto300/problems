package omar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            for (int j = i + 1; j < numsLength; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] bestTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            int complement = nums[i];
            int x = target - complement;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(complement, i);
        }
        return null;
    }

    public int[] bestPerformanTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int j = nums.length - 1;
        int i = 0;

        for (int num : nums) {
            int findNUmer = target - num;
            if (map.containsKey(findNUmer)) {
                int idx = map.get(findNUmer);
                return new int[]{Math.min(idx, i), Math.max(idx, i)};
            }
            map.put(num, i);

            findNUmer = target - nums[j];
            if (map.containsKey(findNUmer)) {
                System.out.println("findNUmer: " + map.get(findNUmer) + " , j: " + j);
                return  new int[]{map.get(findNUmer), j};
            }
            map.put(nums[j], j);

            j--;
            i++;
        }
        return null;
    }
}
