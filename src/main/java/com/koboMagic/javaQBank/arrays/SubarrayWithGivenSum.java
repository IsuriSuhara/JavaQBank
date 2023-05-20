//package main.java.com.koboMagic.javaQBank.arrays;
//
//import java.util.*;
//
//public class SubarrayWithGivenSum {
//
//    static int[] subarraySumBruteForce(int[] arr, Integer target) {
//
////        for(int j = 0; j <= arr.length -1 ; j++){
////            int sum =15;
////            for (int i = j; i <= arr.length - 1 ; i++){
////                sum = sum - arr[i];
////                if(sum == 0){
////                    left = j;
////                    right = i;
////                    break;
////                }
////            }
////        }
//
////        for (int i = 0; i < arr.length ; i++) {
////            int sum = 15;
////            sum = sum - arr[i];
////            if (sum == 0){
////                left = j;
////                right =  i;
////                break;
////            }
////        }
//        Deque stack = new LinkedList();
//        int sum = 0;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            int remainder = target - arr[i];
//            if(map.containsKey(remainder)){
//
//            }
//            stack.push(sum);
//            map.put(sum, i);
//            map.
//
//        }
//        return null;
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,3, 2, 3, 7, 5};
//        int[] list = subarraySumBruteForce(arr, 12);
//        for(int i : list){
//            System.out.print(i + " ");
//        }
//    }
//}
