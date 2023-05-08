package main.java.com.koboMagic.javaQBank.inheritance;

public interface IInt {
    int thevalue = 0;
}


//void compute(); or public void compute();
//All interface methods have to be public. No access control keyword in the method declaration also means public in an interface.
// (Note that the absence of access control keyword in the method declaration in a class means package protected.)

//public final void compute();//final is not allowed.

//static void compute();//An interface can have a static method but the method must have a body in that case.
// protected void compute();//All interface methods have to be public.
