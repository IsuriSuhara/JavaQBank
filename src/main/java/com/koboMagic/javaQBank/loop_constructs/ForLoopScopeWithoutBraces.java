package main.java.com.koboMagic.javaQBank.loop_constructs;

public class ForLoopScopeWithoutBraces {
    public static void main(String[] args) {
        int sum = 0;
        for(int x=0; x<= 10; x++)
            sum +=x;
//        System.out.println("Sum for 0 to" + x);
        System.out.println("=" + sum);
    }
}

//Curly braces are optional for 'for loop'. If for loop doesn't contain curly braces, only the statement following the
// for loop comes within for loop body.
//The scope of loop variables remains within the loop only. So, in this case, the scope of the loop variable x declared
// in line 5, is limited to that for the loop. The code is trying to access that variable in line 7, which is out of
// the scope of the variable x, causing a compile-time error. So, compilation fails due to the&nbsp;error at line 7.
// Hence, option D is correct.