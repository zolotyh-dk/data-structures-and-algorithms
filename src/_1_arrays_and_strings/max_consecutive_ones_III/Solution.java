package _1_arrays_and_strings.max_consecutive_ones_III;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int longest = 0;
        int zeroCount = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
