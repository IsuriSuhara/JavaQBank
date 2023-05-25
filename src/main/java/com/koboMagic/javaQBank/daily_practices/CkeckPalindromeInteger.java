package main.java.com.koboMagic.javaQBank.daily_practices;

public class CkeckPalindromeInteger {

    //write a program to check whether an integer is a palindrome.
    public static boolean isPalindromeInteger(int num) {
        int len = (int) Math.log(num) / 2 + 1;
        int[] arr = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            if (num == 0) break;
            arr[i] = num % 10;
            num /= 10;
        }

        int start = arr[0];
        int end = arr[len - 1];
        boolean present = true;

        for (int i = 1, j = len - 2; i <= (len / 2); i++) {
            if (start != end) {
                present = false;
                break;
            }
            start = arr[i];
            end = arr[j--];
        }

        return present;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeInteger(121121));
    }
}
