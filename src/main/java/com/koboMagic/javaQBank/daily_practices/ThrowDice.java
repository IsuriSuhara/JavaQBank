package main.java.com.koboMagic.javaQBank.daily_practices;

public class ThrowDice {

    public static int throw_dice(int N, int faces, int total) {
        // Base cases
        if (N == 0 && total == 0) {
            // Combination found
            return 1;
        }
        if (N == 0 || total <= 0) {
            // Invalid combination
            return 0;
        }

        int count = 0;
        // Try all possible values for the current dice
        for (int i = 1; i <= faces; i++) {
            // Recursive call with N-1 dice and reduced total
            count += throw_dice(N - 1, faces, total - i);
        }

        return count;
    }

    public static void main(String[] args) {
        int possibilities = throw_dice(3, 6, 7);
        System.out.println("Number of possibilities: " + possibilities);
    }
}
