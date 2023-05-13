package main.java.com.koboMagic.javaQBank.array_data_structure;

public class Arr {

    //For a given array of size N-1, containing integers in the range from 1 to N, write a program to find the
    // missing element in the array.
    public static void findMissingInteger(int[] arr) {
        if (arr == null) return;
        boolean found;
        for (int i = 1; i <= arr.length; i++) {
            found = false;
            for (int ele : arr) {
                if (ele == i) {
                    found = false;
                    break;
                }
                found = true;
            }
            if (found) {
                System.out.println(i);
            }
        }
    }

    //For a given array containing positive integers, write a code to return the sum of the elements of the array.
    public static Integer sumIntegerArr(int[] arr){
        if (arr == null) return 0;
        Integer sum = 0;
        for(int i: arr){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    //For a given unsorted array of size N, write a code to rotate it anticlockwise by D elements.
    //12345 ,2 //45123
    public static int[] rotateArr(int[] arr, int d){
        //last to first
        while(d!=0){
            int last = arr[arr.length-1];
            for(int i = arr.length-1; i>0 ; i--){
                arr[i]= arr[i-1];
            }
            arr[0]=last;
            d--;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        return arr;
    }

    //For a given array of size N, write a code to print the reverse of the array.
    public static void reverseArr(int[] arr){
        for(int i = arr.length-1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,7};
        findMissingInteger(arr);
        Integer sum = sumIntegerArr(arr);
        int[] rotArr=rotateArr(arr, 2);
        System.out.println();
        reverseArr(arr);

    }
}
