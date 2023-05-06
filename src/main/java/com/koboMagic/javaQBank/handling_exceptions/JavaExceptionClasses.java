package main.java.com.koboMagic.javaQBank.handling_exceptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.OutOfMemoryError;
import java.lang.StackOverflowError;
import java.lang.SecurityException;

public class JavaExceptionClasses {
}

//Java has a java.lang.SecurityException. This exception extends RuntimeException and is thrown by the security manager
// upon security violation. For example, when a java program runs in a sandbox (such as an applet) and it tries to use
// prohibited APIs such as File I/O, the security manager throws this exception. Since this exception is explicitly
// thrown using the new keyword by a security manager class, it can be considered to be thrown by the application programmer.
