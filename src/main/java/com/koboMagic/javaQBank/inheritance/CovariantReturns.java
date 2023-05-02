package main.java.com.koboMagic.javaQBank.inheritance;

class Base {
    public Object  getValue() {
        return new Object();
    }
}

class Base2 extends Base {
    public String getValue() {
        return "hello";
    }
}

public class CovariantReturns {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());
    }
}

//It will print hello.
//Covariant returns are allowed since Java 1.5, which means that an overriding method can change the return type to a
// subclass of the return type declared in the overridden method. But remember that covarient returns does not apply
// to primitives.

//Observe that at run time b points to an object of class Base2. Further, Base2 overrides getValue(). Therefore,
// Base2's getValue() will be invoked and it will return hello.

//Access to static and instance fields and static methods depends on the class of reference variable and
// not the actual object to which the variable points to. Observe that this is opposite of what happens in the case of
// instance methods.In case of instance methods the method of the actual class of the object is called.

//Super understanding Hint: try making both getValue() methods static and run again.

//link:https://youtu.be/ycQobqjyMG8
