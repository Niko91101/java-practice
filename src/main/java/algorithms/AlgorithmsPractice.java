package algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class AlgorithmsPractice {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(findIntsToSum(nums, target)));
        System.out.println(Arrays.toString(findIntsToSum2(nums, target)));

    }

    private static int[] findIntsToSum(int[] nums, int targetSum) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == targetSum) {
                    result[0] = i;
                    result[1] = k;
                }
            }
        }

        return result;
    }

    private static int[] findIntsToSum2(int[] nums, int targetSum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = targetSum - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");
    }
}
