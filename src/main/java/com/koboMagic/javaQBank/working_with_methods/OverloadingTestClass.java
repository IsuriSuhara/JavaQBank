package main.java.com.koboMagic.javaQBank.working_with_methods;

class OverloadingTest {

    void m1(int x) {
        System.out.println("m1 int");
    }

//    void m1(double x) {
//        System.out.println("m1 double");
//    }

    void m1(Double x) {
        System.out.println("m1 Double");
    }

    void m1(String x) {
        System.out.println("m1 String");
    }

}

public class OverloadingTestClass {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.m1(1);
    }
}

//Here, m1() is overloading for three different argument types. So when you call ot.m1(1.0), the one with argument of
// type double will be invoked.

//If there is another method with the same name but with a different number of arguments in a class then that method
// can be called as overloaded.

//There is no restriction on the return type. If the parameters are different then the methods are totally different
// (other than the name) so their return types can be anything.

//For overloading a method, the "signature" of the overloaded methods must be different. In simple terms, a method
// signature includes method name and the number and type of arguments that it takes. So if the parameter list of the
// two methods with the same name are different either in terms of number or in terms of the types of the parameters,
// then they are overloaded.  For example: Method m1 is overloaded if you have two methods : void m1(int k); and void
// m1(double d); or if you have: void m1(int k); and void m1(int k, double d);   Note that return type is not considered
// a part of the method signature.

