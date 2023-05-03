package main.java.com.koboMagic.javaQBank.java_data_types;

public class WrapperClassEqualTest {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Long m = new Long(1);
        if (i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}

//equals method in Integer class will be called here.
//Signature of equals method is : boolean equals(Object o); So it can take any object.
// The equals methods of all wrapper classes first check if the two object are of same class or not.
// If not, they immediately return false. Hence it will print not equal.