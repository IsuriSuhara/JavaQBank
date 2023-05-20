package main.java.com.koboMagic.javaQBank;


//input = [2, 5, 10, 3, 15, 9]
//output = 10
public class SecondMax {

    //O(n)
    public static int getSecondMax(int[] arr) {
        int max = arr[0];
        int secondMax = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;

    }

    public static void swapZeros(int[] arr) {

        int[] arrCopy = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arrCopy[j++] = arr[i];
            }
        }

        for (int i : arrCopy) {
            System.out.print(i + " ");
        }
    }

    static int count = 0;
    static int j = 0;
//    public static void moveZeros(int[] arr){
//        for (int i = 0; i < arr.length ; i++){
//            while (arr[i] == 0){
//
//            } else {
//                j = arr[i];
//            }
//        }
//
//    }

    public static void main(String[] args) {
//        int[] arr = {10, 2, 5, 15, 3, 9};
        int[] arr = {1, 2, 0, 0, 4, 3, 0, 0, 6, 5, 0};
//        int secondMax = getSecondMax(arr);
        swapZeros(arr);
//        System.out.println(secondMax);
    }
}
