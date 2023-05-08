package main.java.com.koboMagic.javaQBank.handling_exceptions;

//Which of the following statement is true about the above code?
public class NumberFormatEx {
    Integer number = Integer.valueOf("808.1");

    public static void main(String[] args) {
        System.out.println(new NumberFormatEx().number);
    }
}

//Exception in thread "main" java.lang.NumberFormatException: For input string: "808.1"
//The Integer class valueOf() returns an Integer from given string. But we need to pass a string which has
// correct format for integer otherwise, it will throw a NumberFormatException. In this case, we have passed a string
// which is not an integer value (since what we passed is a fractional number), so option D is correct.


