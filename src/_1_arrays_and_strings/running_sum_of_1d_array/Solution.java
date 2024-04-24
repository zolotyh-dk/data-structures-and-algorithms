package _1_arrays_and_strings.running_sum_of_1d_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
    public int[] runningSum(int[] nums) {
        int currentSum = 0;
        int[] runningSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            runningSum[i] = currentSum;
        }
        return runningSum;
    }
}
