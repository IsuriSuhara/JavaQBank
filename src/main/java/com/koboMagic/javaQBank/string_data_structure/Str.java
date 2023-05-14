package main.java.com.koboMagic.javaQBank.string_data_structure;

public class Str {

    //For a given String S, write a code to reverse the string without disturbing the individual words.
    public static void reverseString(String str){
        String[] arr = str.split("\s+");
        for(int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    //For a given String, write a program to print all permutations (of its characters) and return it in a
    //lexicographically sorted fashion.
//    public static void permutateStringAndSort(String s){
//        int fac = 6;
//        for(int i = 0; i<= fac; i++ ){
//            String start = s.substring(i,i+1);
//            String sub = s.substring(i+1);
//            for(int j =0; j<= sub.length()-1; j++){
//                System.out.println(start+sub.substring(j));
//            }
//        }
//    }

    public static void main(String[] args) {
        String str = "Unlimited     Mind Has Unlimited Potential";
        String s="ABC";
//        reverseString(str);
//        permutateStringAndSort(s);
    }
}
