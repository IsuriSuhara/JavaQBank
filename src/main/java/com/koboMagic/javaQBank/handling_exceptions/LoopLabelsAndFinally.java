package main.java.com.koboMagic.javaQBank.handling_exceptions;

//What will be the result of attempting to compile and run the following program?
public class LoopLabelsAndFinally {

    public static void main(String[] args) {
        int i = 0;
        loop:
        // 1
        {
            System.out.println("Loop Lable line");
            try {
                for (; true; i++) {
                    System.out.print(i + " ");
                    if (i > 5) break loop;       // 2
                }
            } catch (Exception e) {
                System.out.println("Exception in loop.");
            } finally {
                System.out.println("\n"+"In Finally");      // 3

            }
        }
    }
}

//No compilation error and line 3 will be executed.

//You can apply a label to any code block or a block level statement (such as a for statement) but not to declarations.
// For example: loopX : int i = 10; this is not valid
//Even if the break takes the control out of the block, the finally clause will be executed.

//A break without a label breaks the current loop (i.e. no iterations any more) and a break with a label tries to pass
// the control to the given label. 'Tries to' means that if the break is in a try block and the try block has a finally
// clause associated with it then it will be executed.

//Even if the break takes the control out of the block, the finally clause will be executed.
