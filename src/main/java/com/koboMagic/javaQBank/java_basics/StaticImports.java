package main.java.com.koboMagic.javaQBank.java_basics;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.System.out;

public class StaticImports {
    public StaticImports() {
        out.println(MAX_VALUE);
    }
}

//The code uses out.println instead of System.out.println. out is a static field in java.lang.System class.
// That is why you need to import the static fields of java.lang.System.
//The order of keywords for a static import must be "import static ... ".
//You can either import all the static members using import static java.lang.Integer.* or one specific member using
// import static java.lang.Integer.MAX_VALUE;
//You must specify the full package name of the class that you are importing (just like the regular import statement).
// So, import static Integer.*; is wrong.

//Using a fully qualified class name always works irrespective of whether you import the package or not