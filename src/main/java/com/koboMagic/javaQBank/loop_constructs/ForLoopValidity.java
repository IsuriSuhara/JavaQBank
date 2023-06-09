package main.java.com.koboMagic.javaQBank.loop_constructs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Identify the valid for loop constructs assuming the following declarations:
public class ForLoopValidity {

    public static void main(String[] args) {
        Object o = null;
        Collection c = new ArrayList();
        int[][] ia = {};

//        for(o : c){ } //line 1
        for(final Object o2 :c){ }
//        for(int i : ia) { } //line 2
//        for(Iterator it : c.iterator()){ }
        for(int i : ia[0]){ }
    }
}

//  for(o : c){ }   //Cannot use an existing/predefined variable in the variable declaration part.

//for(final Object o2 :c){ } //final is the only modifier (excluding annotations) that is allowed here.

//for(int i : ia) { } //Each element of ia is itself an array. Thus, they cannot be assigned to an int.

// for(Iterator it : c.iterator()){ } //c.iterator() does not return any Collection.
// Note that the following would have been valid:
// Collection<Iterator> c = //some collection that contains Iterator objects for(Iterator it : c){ }

//for(int i : ia[0]){ }
//Since ia[0] is an array of ints, this is valid. (It may throw a NullPointerException or ArrayIndexOutOfBoundsException
// at runtime if ia is not appropriately initialized.)