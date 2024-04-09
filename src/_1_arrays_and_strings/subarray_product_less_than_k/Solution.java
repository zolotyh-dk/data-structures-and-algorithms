package _1_arrays_and_strings.subarray_product_less_than_k;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 1, 1};
        Solution solution = new Solution();
        System.out.println(solution.numSubarrayProductLessThanK(nums, 1));

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int currProduct = 1;
        int left = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            currProduct *= nums[right];
            while (currProduct >= k) {
                currProduct /= nums[left];
                left++;
            }
            result += right - left + 1;
        }
        return result;
    }
}
