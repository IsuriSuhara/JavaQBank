package main.java.com.koboMagic.javaQBank.handling_exceptions;

public class JVMUncaughtExceptionHandlingMechanism {
    public static void main(String[] args) {
        try {
            doTest();
        } catch (MyGreatException me) {
            System.out.println(me);
        }
    }

    static void doTest() throws MyGreatException {
        int[] array = new int[10];
        array[10] = 1000;
//        array[9] = 1000;
        System.out.println(array[9]);
//        doAnotherTest();
    }

    static void doAnotherTest() throws MyGreatException {
        throw new MyGreatException("Exception from doAnotherTest");
    }
}

class MyGreatException extends Exception {
    public MyGreatException(String msg) {
        super(msg);
    }
}

//what is correct?
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10 at exceptions.TestClass.doTest(TestClass.java:14)
// at exceptions.TestClass.main(TestClass.java:5) //correct

//Error in thread "main" java.lang.ArrayIndexOutOfBoundsException

//exceptions.MyException: Exception from doAnotherTest

//exceptions.MyException: Exception from doAnotherTest at exceptions.TestClass.doAnotherTest(TestClass.java:29)
// at exceptions.TestClass.doTest(TestClass.java:25) at exceptions.TestClass.main(TestClass.java:14)




//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//You are creating an array of length 10. Since array numbering starts with 0, the last element would be array[9].
// array[10] would be outside the range of the array and therefore an ArrayIndexOutOfBoundsException will be thrown,
// which cannot be caught by catch(MyException ) clause. The exception is thus thrown out of the main method and is
// handled by the JVM's uncaught exception handling mechanism, which prints the stack trace.

//java.lang.ArrayIndexOutOfBoundsException extends java.lang.IndexOutOfBoundsException, which extends
// java.lang.RuntimeException, and which in turn extends java.lang.Exception. Therefore, ArrayIndexOutOfBoundsException
// is an Exception and not an Error.

//Note that there are a few questions in the exam that test your knowledge about how exception messages are printed.
// When you use System.out.println(exception), a stack trace is not printed. Just the name of the exception class and
// the message is printed. When you use exception.printStackTrace(), a complete chain of the names of the methods called,
// along with the line numbers, is printed. It contains the names of the methods in the chain of method calls that led
// to the place where the exception was created going back up to the point where the thread, in which the exception was
// created, was started.
