package _1_arrays_and_strings.minimum_value_to_get_positive_step_by_step_sum;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, -2, -3};
        System.out.println(solution.minStartValue(nums));
    }
    public int minStartValue(int[] nums) {
        int minPartSum = nums[0];
        int currentPartSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentPartSum += nums[i];
            if (currentPartSum < minPartSum) {
                minPartSum = currentPartSum;
            }
        }
        if (minPartSum > 0) {
            return 1;
        } else {
            return 1 - minPartSum;
        }
    }
}
