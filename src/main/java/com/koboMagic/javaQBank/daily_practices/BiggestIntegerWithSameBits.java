package main.java.com.koboMagic.javaQBank.daily_practices;

public class BiggestIntegerWithSameBits {

    public static int getNextIntegerWithSameNumberOfOnes(int n) {

        int originNumBits = countSetBits(n);

        do {
            n++;
        }while(countSetBits(n)!= originNumBits);

        return n;
    }

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count += n & 1;
        }

        return count;
    }


    public static void main(String[] args) {

        System.out.println(getNextIntegerWithSameNumberOfOnes(6));
    }
}
