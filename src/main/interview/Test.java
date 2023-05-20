package main.interview;

import java.util.ArrayList;

public class Test {

    public static ArrayList getDuplicateArr(int[] arr) {

        ArrayList list = new ArrayList();

        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == num) {
                if(i +1 > arr.length-1){
                    list.add(arr[i]);
                    break;
                }
                if (arr[i] == arr[i + 1]) {
                    continue;
                }
                list.add(arr[i]);
            }

            num = arr[i];
        }


        //recursive call
//        int[] returnArr = new int[arr.length];
//        int count = 0;
//        for (int i = 0, j = 0; i < arr.length ; i++){
////            if (!result.add(arr[i])){
////                returnArr[j++] = arr[i];
////                count++;
////            }
//
//            if(!result.add(arr[i])){
//                arr[j++] = arr[i];
//                count++;
//            }
//        }
//
//        int[] res = new int[count];
//        for(int i = 0 ; i < count; i++){
//            res[i] = arr[i];
//        }

        return list;


    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 2, 3, 3, 4,4};

        System.out.print(getDuplicateArr(arr));
    }
}
