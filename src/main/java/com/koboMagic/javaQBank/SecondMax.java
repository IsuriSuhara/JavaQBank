package main.java.com.koboMagic.javaQBank;


//input = [2, 5, 10, 3, 15, 9]
//output = 10
public class SecondMax {

    //O(n)
    public static int getSecondMax(int[] arr){
        int max = arr[0];
        int secondMax = 0;
        for(int i = 0; i <= arr.length-1; i++){
            if (arr[i]> max){
                max = arr[i];
            }
            if (arr[i] != max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax;

    }

//    public static void swapZeros(int[] arr) {
//
//        boolean zeroBetweenIntegers = false;
//
//        int first = arr[0];
//        int second = arr[1];
//        int third = arr[2];
//
////        for (int k = 0; k <= arr.length - 1;k++) {}
//
//        while (zeroBetweenIntegers) {}
//        for (int i = 0; i <= arr.length - 1; i++) {
//
//            if (arr[i] == 0) {
//                int temp = arr[i];
//                //shifting the whole array to left
//                for (int j = i; j <= arr.length-i; j++){
//                    arr[j] = arr[j + 1];
//                }
//                arr[arr.length - 1] = temp;
//            }
//        }
//
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }

    public static void main(String[] args) {
//        int[] arr = {10, 2, 5, 15, 3, 9};
        int[] arr = {1, 2, 0, 0, 4, 3, 0, 0, 6, 5, 0};
        int secondMax = getSecondMax(arr);
//        swapZeros(arr);
        System.out.println(secondMax);
    }
}
