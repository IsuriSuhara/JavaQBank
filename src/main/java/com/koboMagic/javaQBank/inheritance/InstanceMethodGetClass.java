package main.java.com.koboMagic.javaQBank.inheritance;

class Super1 {
}

class Sub1 extends  Super1{
}

public class InstanceMethodGetClass {
    public static void main(String[] args) {
        Super1 a = new Super1();
        Sub1 aa = new Sub1();
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
    }
}


//a = class main.java.com.koboMagic.javaQBank.inheritance.Sub1
//aa = class main.java.com.koboMagic.javaQBank.inheritance.Sub1

//getClass is a public instance method in Object class. That means it is polymorphic.
// In other words, this method is bound at run time and so it returns the name of the class of the actual object
// to which the reference points.
//Here, at run time, both - a and aa, point to an object of class Sub1. So both will print Sub1.