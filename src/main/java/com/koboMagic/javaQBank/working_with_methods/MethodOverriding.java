package main.java.com.koboMagic.javaQBank.working_with_methods;

//Which of the following methods can be inserted at line //1 ?
class Teacher{
    void teach(String student){
        /* lots of code */
    }
}
class Prof extends Teacher{
    //1
//    public void teach() throws Exception{}
//    private void teach(int i) throws Exception{} //
//    protected void teach(String s){}
    public final void teach(String s){}
//    public abstract void teach(String s);
}
public class MethodOverriding {
}

//public abstract void teach(String s)
//This is wrong because class Prof has not been declared as abstract. Note that otherwise it is OK to override a method
// by an abstract method.
//Note that 'protected' is less restrictive than default 'no modifier'. So choice 3 is valid.
//"public abstract void teach(String s)" would have been valid if class Prof had been declared abstract.

//2 It overloads the teach() method instead of overriding it.