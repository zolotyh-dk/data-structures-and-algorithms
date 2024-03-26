package _1_arrays_and_strings.squares_of_a_sorted_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {-7,-3,2,3,11};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(nums)));
    }
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;
        while (position >= 0) {
            int leftSure = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSure > rightSquare) {
                result[position] = leftSure;
                left++;
            } else {
                result[position] = rightSquare;
                right--;
            }
            position--;
        }
        return result;
    }
}
