package main.java.com.koboMagic.javaQBank.string_stringbuilder;

//What will be the output of running this class?
public class StringObjEquivalenceTest {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((Other.hello == hello) + " ");   //line 1
        System.out.print((hello == ("Hel"+"lo")) + " ");  //line 2
        System.out.print((hello == ("Hel"+lo)) + " ");    //line 3
        System.out.println(hello == ("Hel"+lo).intern()); //line 4
    }
}
class Other { static String hello = "Hello"; }


//true true false true

//Facts on String
//1. Literal strings within the same class in the same package represent references to the same String object.
//2. Literal strings within different classes in the same package represent references to the same String object.
//3. Literal strings within different classes in different packages likewise represent references to the same String object.
//4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals.
//5. Strings computed at run time are newly created and therefore are distinct. (So line 3 prints false.)
//6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 4 prints true.)