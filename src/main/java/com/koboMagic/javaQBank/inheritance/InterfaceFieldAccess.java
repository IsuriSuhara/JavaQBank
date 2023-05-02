package main.java.com.koboMagic.javaQBank.inheritance;

public class InterfaceFieldAccess implements IInt{
    public static void main(String[] args) {
        InterfaceFieldAccess s = new InterfaceFieldAccess();  //1
         int j = s.thevalue;       //2
         int k = IInt.thevalue;    //3
         int l = thevalue;         //4
    }
}

//As a rule, fields defined in an interface are public, static, and final.
// The methods are public.
// Here, the interface IInt defines thevalue and thus any class that implements this interface gets this field.
// Therefore, it can be accessed using s.thevalue or just thevalue inside the class.
// Also, since it is static, it can also be accessed using IInt.thevalue or InterfaceFieldAccess.thevalue.
