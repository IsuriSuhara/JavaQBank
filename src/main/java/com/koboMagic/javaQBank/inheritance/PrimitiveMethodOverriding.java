package main.java.com.koboMagic.javaQBank.inheritance;

class P  {
    public static double m1(int a) throws ChannelException{
        return a * 10 / 4 - 30;
    }
}

class P2 extends P {
    public static double m1(int a) throws FrameCollisionException {
        return a * 10 / 4.0;
    }
}

public class PrimitiveMethodOverriding {
    public static void main(String[] args) {
        try {
            System.out.println(P.m1(10));
            System.out.println(P2.m1(20));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ChannelException extends Exception{}
class DataFloodingException extends ChannelException{}
class FrameCollisionException extends DataFloodingException{}

//The return type should be same for overridden and overriding method.
//a*10/4-30; generates an int which can be returned as a double without any cast.
//Note that when a method returns objects (as opposed to primitives, like in this question), the principle of covariant
// returns applies. Meaning, the overriding method is allowed to return a subclass of the return type defined in the
// overridden method. Thus, if a base class's method is: public A m(); then a subclass is free to override it with:
// public A1 m(); if A1 extends A.

//There are 2 important concepts involved here:
//1. The overriding method must have same return type in case of primitives (a subclass is allowed in case of classes)
// (Therefore, the choices returning int are not valid.) and the parameter list must be the same (The name of the
// parameter does not matter, just the Type is important).

//2. The overriding method can throw a subset of the exception or subclass of the exceptions thrown by the overridden
// class. Having no throws clause is also valid since an empty set is a valid subset.
