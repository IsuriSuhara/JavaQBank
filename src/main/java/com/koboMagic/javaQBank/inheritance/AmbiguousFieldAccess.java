package main.java.com.koboMagic.javaQBank.inheritance;

public class AmbiguousFieldAccess implements I1, I2{

    public void m1() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        AmbiguousFieldAccess tc = new AmbiguousFieldAccess();
        ((I1) tc).m1();
        System.out.println(((I1) tc).VALUE);

    }
}

interface I1 {
    int VALUE = 1;

    void m1();
}

interface I2 {
    int VALUE = 2;

    void m1();
}

//Having ambiguous fields does not cause any problems but referring to such fields in an ambiguous way will cause
// a compile time error. So you cannot call : System.out.println(VALUE) as it will be ambiguous. as there is no
// ambiguity in referring the field: TestClass tc = new TestClass(); System.out.println(( ( I1) tc).VALUE); So, any of
// the VALUE fields can be accessed by casting.
