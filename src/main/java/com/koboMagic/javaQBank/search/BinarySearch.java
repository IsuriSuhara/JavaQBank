//package main.java.com.koboMagic.javaQBank.search;
//
//import java.util.HashSet;
//
//public class BinarySearch {
//
//    public static int searchTarget(int[] arr, int target) {
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static int[] plusOne(int[] digits) {
//        int len = digits.length;
//        for (int i = len - 1; i >= 0; i--) {
//            if (digits[i] != 9) {
//                digits[i] += 1;
//                return digits;
//            } else {
//                digits[i] = 0;
//            }
//        }
//        int[] arr = new int[len + 1];
//        arr[0] = 1;
//        return arr;
//    }
//
////    public static boolean isValidSudoku(int[][] board){
////        HashSet
////
////        return true;
////    }
//
//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int count = 0, max = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                count += 1;
//                if(count> max){
//                    max = count;
//                }
//            } else {
//                count = 0;
//            }
//        }
//
//        return max;
//    }
//
//    public int[] sortedSquares(int[] nums) {
//        int sortedStart = 0;
//        for(int i = 0; i < nums.length ; i++){
//            if(nums[i]>=0){
//                sortedStart = i;
//                break;
//            }
//        }
//
//        int[] arr = new int[nums.length];
//        arr[0] = nums[sortedStart];
//        for(int i = 0; i < sortedStart; i++ ){
//
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 0, 0, 1, 1, 1, 4, 3, 0, 0, 6, 5, 0};
////        System.out.print(searchTarget(arr, 3));
////        int[] nums = {9,8,7,6,5,4,3,2,1,0};
////        int[] nums = new int[5];
////        int[] arrPlusOne = plusOne(nums);
////
////        for (int i : arrPlusOne) {
////            System.out.print(i);
////        }
//
//        System.out.print(findMaxConsecutiveOnes(arr));
//
//
//    }
//}
