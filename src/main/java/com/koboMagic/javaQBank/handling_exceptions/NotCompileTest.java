package main.java.com.koboMagic.javaQBank.handling_exceptions;

public class NotCompileTest {

    public float parseFloat(String s){
        float f = 0.0f;
        try{
            f = Float.valueOf(s).floatValue();
            return f ;
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input " + s);
            f = Float.NaN ;
            return f;
        }
        finally { System.out.println("finally");}
//        return f ; //Note that the return statement after finally block is unreachable.
    }

    public static void main(String[] args) {
        NotCompileTest obj = new NotCompileTest();
//        Float f = obj.parseFloat("1");
//        Float f = obj.parseFloat("0x.1");
        Float f = obj.parseFloat("0.1");//If input is "0.1" then it will return 0.1 and print finally.
        System.out.println(f);
    }
}
