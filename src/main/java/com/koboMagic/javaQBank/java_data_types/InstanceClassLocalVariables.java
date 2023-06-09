package main.java.com.koboMagic.javaQBank.java_data_types;

//Given the following class, which statements can be inserted at line 1 without causing the code to fail compilation?
public class InstanceClassLocalVariables {
    int a;
    int b = 0;
    static int c;

    public void m() {
        int d;
        int e = 0;
//        static int f =0;//modifier static is not allowed here
        // Line 1
        a++;
        b++;
        c++;
        e++;
//        d++;
    }
}

//Here, 'a' is an instance variable of type int. Therefore, it will be given a default value of Zero and so it need not
// be initialized explicitly.
//Here 'c' is a class variable (also called as static variable) of type int so it will be given a default value of Zero
// and so it need not be initialized explicitly.
//d++;//This will not compile because 'd' is not initialized. Note that automatic variables (also called as method local
// variables i.e. variables declared within a method) have to be explicitly initialized.
//All the instance or static variables are given a default values if they are not explicitly initialized. All numeric
// variable are given a value of zero or equivalent to zero (i.e. 0 for integral types and 0.0 for double/float).
// Booleans are initialized to false and objects are initialized to null.

//Note that local (aka automatic) variables, such as the variables d and e in the code given here, are not initialized
// automatically. They have to be initialized explicitly. However, it is ok to leave them uninitialized if you don't
// use them anywhere in the code (as is the case with the variable d).
