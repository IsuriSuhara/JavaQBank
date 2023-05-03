package main.java.com.koboMagic.javaQBank.arrays;

public class ArrayInitialization {

//        String[] sC = new String[1];
//        sC[0] ="aaa";// this statement cannot be compiled out side of instance/static block

    public static void main(String[] args) {
        //    String[] sA = new String[1] { "aaa"};

        String[] sB = new String[] { "aaa"};

        String[] sC = new String[1];//#
        sC[0] ="aaa";//# this statement cannot be compiled out side of instance/static block, comment # lines and uncomment
        //lines outside of the main method and see.

        String[] sD = {new String( "aaa")};

        String[] sE = { "aaa"};
    }
}
