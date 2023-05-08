package main.java.com.koboMagic.javaQBank.java_data_types;

public class WrapperClassEqualTest {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Long m = new Long(1);
//        System.out.println(i==m);
        if (i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}

//System.out.println(i==m);//will not compile
//If the compiler can figure out that something can NEVER happen, then it flags an error. In this question, the compiler
// knows that i or m can never point to the same object in any case because they are references to different classes of
// objects that have no relation ( superclass/subclass ) between themselves.

//equals method in Integer class will be called here.
//Signature of equals method is : boolean equals(Object o); So it can take any object.
// The equals methods of all wrapper classes first check if the two object are of same class or not.
// If not, they immediately return false. Hence it will print not equal.