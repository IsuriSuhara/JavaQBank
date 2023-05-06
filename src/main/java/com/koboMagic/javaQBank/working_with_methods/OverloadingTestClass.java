package main.java.com.koboMagic.javaQBank.working_with_methods;

class OverloadingTest {

    void m1(int x) {
        System.out.println("m1 int");
    }

    void m1(double x) {
        System.out.println("m1 double");
    }

    void m1(String x) {
        System.out.println("m1 String");
    }

}

public class OverloadingTestClass {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.m1(1.0);
    }
}

//Here, m1() is overloading for three different argument types. So when you call ot.m1(1.0), the one with argument of
// type double will be invoked.
