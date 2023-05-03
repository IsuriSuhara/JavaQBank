package main.java.com.koboMagic.javaQBank.handling_exceptions;

//public class ExceptionThrow {
//    public static void main(String[] args) throws Exception{
//        ExceptionThrow tc = new ExceptionThrow();
//        tc.myMethod();
//    }
//
//    public void myMethod() throws Exception{
//            yourMethod();
//    }
//
//    public void yourMethod() throws Exception{
//        throw new Exception();
//    }
//}

//exception is propagated in the stack or it should be handled like below to compile.  To run without en exception in should
//be handled by the code.

public class ExceptionThrow {
    public static void main(String[] args){
        ExceptionThrow tc = new ExceptionThrow();
        tc.myMethod();
    }

    public void myMethod(){
            yourMethod();
    }

    public void yourMethod(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//public class ExceptionThrow {
//    public static void main(String[] args) {
//        ExceptionThrow tc = new ExceptionThrow();
//        tc.myMethod();
//    }
//
//    public void myMethod() {
//        try {
//            yourMethod();
//        }
//        catch (Exception e){}
//    }
//
//    public void yourMethod() throws Exception{
//        throw new Exception();
//    }
//}

//public class ExceptionThrow {
//    public static void main(String[] args){
//        ExceptionThrow tc = new ExceptionThrow();
//        try {
//            tc.myMethod();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void myMethod() throws Exception{
//        yourMethod();
//    }
//
//    public void yourMethod() throws Exception{
//        throw new Exception();
//    }
//}