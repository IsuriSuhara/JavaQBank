package main.java.com.koboMagic.javaQBank.daily_practices;

import java.util.Arrays;

public class NextGreaterPermutation {
//Given a number represented by a list of digits find the next greater permutation of a number in terms of lexicographic
// ordering. If there is not greater permutation possible return the permutation with the lowest value/ordering.
    public static void nextPermutation(int[] nums) {
        // Find the first pair of adjacent elements in reverse order
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Find the smallest element larger than nums[i] in the suffix
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            swap(nums, i, j);
        }

        // Reverse the suffix
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 2]

        nums = new int[]{3, 2, 1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 2, 3]

        nums = new int[]{1, 1, 5};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 5, 1]
    }
}
