package main.java.com.koboMagic.javaQBank.inheritance;

//What will be the result of compiling and running the following code?
//uncomment code and see
class Ground{
    public short getValue(){ return 1; } //1
}
class Soil extends Ground{
//    public byte getValue(){ return 2; } //2
}
public class OverridingMethodsWithPrimitiveReturns {
    public static void main(String[] args) {
        Ground b = new Soil();
        System.out.println(b.getValue()); //3
    }
}

//Compile time error at //2

//In case of overriding a method with primitive return type, the return type of the overriding method must
// match exactly to the return type of the overridden method.
//(In case of objects, the return type of the overriding method may be a subclass of the return type of the
// overridden method.)