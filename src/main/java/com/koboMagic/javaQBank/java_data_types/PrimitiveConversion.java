package main.java.com.koboMagic.javaQBank.java_data_types;

public class PrimitiveConversion {
    public static void main(String[] args) {
        short s = 12 ;
        long g = 012 ;
//        int i = (int) false;
        float f = -123;
//        float d = 0 * 1.5;
        float d = 0 * 1.5f;
        float e = 0 * (float)1.5 ;
    }
}

//short s = 12 ;//This is valid since 12 can fit into a short and an implicit narrowing conversion can occur.
//long g = 012 ;//012 is a valid octal number.
//int i = (int) false; //Values of type boolean cannot be converted to any other types.
//float f = -123; //Implicit widening conversion will occur in this case.
//float d = 0 * 1.5;//double cannot be implicitly narrowed to a float even though the value is representable by a float.

//An implicit narrowing primitive conversion may be used if all of the following conditions are satisfied:
// 1. The expression is a compile time constant expression of type byte, char, short, or int.
// 2. The type of the variable is byte, short, or char.
// 3. The value of the expression (which is known at compile time, because it is a constant expression) is representable
// in the type of the variable.
// Note that implicit narrowing conversion does not apply to long or double. So, char ch = 30L; will fail even though
// 30 is representable in char.
