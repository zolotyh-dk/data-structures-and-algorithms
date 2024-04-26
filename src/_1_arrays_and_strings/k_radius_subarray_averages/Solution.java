package _1_arrays_and_strings.k_radius_subarray_averages;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        System.out.println(Arrays.toString(solution.getAverages(nums, k)));
    }

    public int[] getAverages(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }
        int windowSize = 2 * k + 1;
        int[] averages = new int[nums.length];
        Arrays.fill(averages, -1);
        if (windowSize > nums.length) {
            return averages;
        }

        long[] prefixSum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = k; i < nums.length - k; i++) {
            int left = i - k;
            int right = i + k;
            long sum = prefixSum[right + 1] - prefixSum[left];
            averages[i] = (int) (sum / windowSize);
        }
        return averages;
    }
}
