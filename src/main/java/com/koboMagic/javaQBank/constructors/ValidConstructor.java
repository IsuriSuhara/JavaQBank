package main.java.com.koboMagic.javaQBank.constructors;


//Which lines contain a valid constructor in the following code?
public class ValidConstructor {

    public ValidConstructor(int a, int b){} // 1
    public void ValidConstructor(int a) { }   // 2
//    public ValidConstructor(String s); // 3
    private ValidConstructor(String s, int a) { }     //4
    public ValidConstructor(String s1, String s2) { }; //5
}

//Constructors cannot return anything. Not even void.
//Constructors cannot have empty bodies (i.e. they cannot be abstract)
//You may apply public, private, and protected modifiers to a constructor.
// But not static, final, synchronized, native and abstract.
// It can also be package private i.e. without any access modifier.
//line 5: The compiler ignores the extra semi-colon.
//It is interesting to note that public void TestClass(int a) {} // 2 will actually compile. It is not a constructor,
// but compiler considers it as a valid method!
