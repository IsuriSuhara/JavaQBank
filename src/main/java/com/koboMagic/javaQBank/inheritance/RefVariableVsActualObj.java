package main.java.com.koboMagic.javaQBank.inheritance;

//What will the following code print when compiled and run?
class ABCD {
    int x = 10;
    static int y = 20;
}

class MNOP extends ABCD {
    int x = 30;
    static int y = 40;
}

class A {
    int i = 10;

    int m1() {
        return i;
    }
}

class B extends A {
    int i = 20;

    int m1() {
        return i;
    }
}

class C extends B {
    int i = 30;

    int m1() {
        return i;
    }
}

public class RefVariableVsActualObj {
    public static void main(String[] args) {
        System.out.println(new MNOP().x + ", " + new MNOP().y);
//        ABCD a = new MNOP();
//        System.out.println(a.x);
//        System.out.println(a.y);

        A o1 = new C();
        B o2 = (B) o1;
        System.out.println(o1.m1());
        System.out.println(o2.i);
        System.out.println(o2.m1());
    }
}

//30, 40
//30
//20
//30

//Access to static and instance fields and static methods depends on the class of reference variable and not the actual object
// to which the variable points to. Observe that this is opposite of what happens in the case of instance methods.
// In case of instance methods the method of the actual class of the object is called.
// Therefore, in case of System.out.println(new MNOP().x); the reference is of type MNOP and so MNOP's x will be accessed.
