package main.java.com.koboMagic.javaQBank.inheritance;

//see T3,T2,T1
public class TTest implements T3{
    @Override
    public void m1() {

    }

    @Override
    public void m1(int x) {

    }

    public static void main(String[] args) {
    }
}

//Regarding T1,T2, and T3
//Having ambiguous fields or methods does not cause any problem by itself (except in the case of default methods)
// but referring to such fields or methods in an ambiguous way will cause a compile time error.
// Having m1() in T3 is also fine because even though m1() is declared in T2 as well as T3 , the definition to both
// resolves unambiguously to only one m1(). Explicit cast is not required for calling the method m1() : ( ( T2) t).m1();

//m1(int x) is valid because it is a totally independent method declared by T3.
