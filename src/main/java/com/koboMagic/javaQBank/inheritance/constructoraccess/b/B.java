package main.java.com.koboMagic.javaQBank.inheritance.constructoraccess.b;

//What will be printed when you try to compile and run class B?
//uncomment code and see
//public class B extends A {
//    B() {
//    }
//
//    public void print() {
//        System.out.println("B");
//    }
//
//    public static void main(String[] args) {
//        new B();
//    }
//}

//It will not compile.
//Because A() is not accessible in B.

//Note that there is no modifier for A's constructor. So it has default access.
// This means only classes in package a can use it. Also note that class B is in a different package
// and is extending from A. In B's constructor the compiler will automatically add super() as the first line.
// But since A() is not accessible in B, this code will not compile.
