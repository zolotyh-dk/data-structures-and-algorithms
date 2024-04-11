package _1_arrays_and_strings.maximum_average_subarray_I;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution.findMaxAverage(nums, k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAverage = sum / k;
        int left = 1;
        int right = k;
        while (right < nums.length) {
            sum -= nums[left - 1];
            sum += nums[right];
            maxAverage = Math.max(maxAverage, sum / k);
            left++;
            right++;
        }
        return maxAverage;
    }
}
