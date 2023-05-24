package java.com.interview;

import java.util.HashSet;

public class Test {


    public static void getSetWithoutDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i  : arr){

            set.add(i);
        }
    }
}
