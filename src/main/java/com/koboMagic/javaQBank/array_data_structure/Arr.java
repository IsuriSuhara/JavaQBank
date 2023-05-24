package main.java.com.koboMagic.javaQBank.array_data_structure;

public class Arr {

    //For a given array of size N-1, containing integers in the range from 1 to N, write a program to find the
    // missing element in the array.
    public static void findMissingInteger(int[] arr) {
        if (arr == null) return;
        boolean found;
        for (int i = 1; i <= arr.length + 1; i++) {
            found = false;
            for (int ele : arr) {
                if (ele == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
                break;
            }
        }
    }


    //For a given array containing positive integers, write a code to return the sum of the elements of the array.
    public static Integer sumIntegerArr(int[] arr) {
        if (arr == null) return 0;
        Integer sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    //For a given unsorted array of size N, write a code to rotate it anticlockwise by D elements.
    //12345 ,2 //45123
    public static int[] rotateArr(int[] arr, int d) {
        //last to first
        while (d != 0) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            d--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;
    }

    //For a given array of size N, write a code to print the reverse of the array.
    public static void reverseArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //For a given array A, write a code to delete the duplicate elements in the array.
    public static void deleteDuplicates(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > 1) {
                arr[i] = -1;
            }
        }

        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == -1) {
                count++;
            }
        }

        int[] arrCopy = new int[arr.length - count];
        for (int i = 0, j = 0; i <= arr.length - 1; i++) {
            if (arr[i] != -1) {
                arrCopy[j++] = arr[i];
            }
        }

        for (int i : arrCopy) {
            System.out.print(i + " ");
        }
    }

    //For a given array Arr[] containing integer elements, write a code to find the minimum and maximum elements of the array
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int secondMax = arr[0];
        for (int i = 0, j = 0; i <= arr.length - 1; i++) {
            if (arr[i] != max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }

    //For a given array of size N containing distinct integer numbers, write a code to sort the array in the wave fashion.
    public static void sortWaveFasion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i = i + 2) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    //Write a code to find the maximum subarray of non-negative numbers from a given array containing integer values.
    public static void findMaxSubArray(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] subArr = new int[count];
        for (int i = 0, j = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {
                subArr[j++] = arr[i];
            }
        }
        System.out.println("subArray length: " + count);
        for (int i : subArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -3, 2, 7, 10, 5, 3, 7, 1, 1, -6, -10};
        int[] arr1 = {1,2,3,5,6,7,8,9};
        findMissingInteger(arr1);
//        Integer sum = sumIntegerArr(arr);
//        int[] rotArr=rotateArr(arr, 2);
//        System.out.println();
//        reverseArr(arr);
//        deleteDuplicates(arr);
//        findMaxMin(arr);
//        sortWaveFasion(arr);
//        findMaxSubArray(arr);
    }
}
