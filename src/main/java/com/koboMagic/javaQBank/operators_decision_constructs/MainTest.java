package main.java.com.koboMagic.javaQBank.operators_decision_constructs;

//Which of the following statements are true if the above program is run with the command line : java Test closed
public class MainTest {
    public static void main(String[] args) {
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
        else System.out.println("Go away " + args[1]);
    }
}

//what will happen?
//It will throw ArrayIndexOutOfBoundsException at runtime.
//It will end without exceptions and will print nothing.
//It will print Go away
//It will print Go away and then will throw ArrayIndexOutOfBoundsException.
//None of the above.

//run with different arguments ex:
//java Test closed //It will end without exceptions and will print nothing.
//java Test open // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//java Test open xyz // Go away xyz
//java Test open someone //Hello!

//As in C and C++, the Java if statement suffers from the so-called "dangling else problem," The problem is that both
//the outer if statement and the inner if statement might conceivably own the else clause. In this example, one might
// be tempted to assume that the programmer intended the else clause to belong to the outer if statement.

//The Java language, like C and C++ and many languages before them, arbitrarily decree that an else clause belongs
// to the innermost if so as the first if() condition fails (args[0] not being "open") there is no else associated
// to execute. So, the program does nothing. The else actually is associated with the second if. So had the command
// line been : java Test open, it would have executed the second if and thrown ArrayIndexOutOfBoundsException.
// If the command line had been: java Test open xyz, it would execute the else part(which is associated with the
// second if) and would have printed "Go away xyz".