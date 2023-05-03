package main.java.com.koboMagic.javaQBank.inheritance;

import java.util.Arrays;

interface Account {
    public default String getId() {
        return "0000";
    }

    static String getName() {
        return "Isuri";
    }
}

interface PremiumAccount extends Account {
    //INSERT CODE HERE
//    String getId();//line 1
//    default String getId(){ return "1111"; }//line 2
//    static String getId(){ return "1111"; } //line 3
    default String getName() {
        return "inteface default method";
    }
}

public class DefaultAndStaticMethodsInInterfaces implements Account, PremiumAccount {
//    public String getName(){
//        return "class instance method";
//    }

    public static void main(String[] args) {
        System.out.println(new Boolean("true")== Boolean.TRUE);
        Account.getName();
        PremiumAccount obj = new DefaultAndStaticMethodsInInterfaces();
        System.out.println(obj.getName());
    }
}

//line 1:An interface can redeclare a default method and also make it abstract.
//line 2:An interface can redeclare a default method and provide a different implementation.
//line 3:Will not compile.

//Trying to override a static method with a non-static method (and vice-versa) in a class will result in a compilation error.
//Even in case of interfaces, a subinterface cannot override a default method with a static method.
//You can, however, have a default method in a subinterface with the same signature as a static method of its
// super interface because a static method of an interface can only be called using that interface's name.