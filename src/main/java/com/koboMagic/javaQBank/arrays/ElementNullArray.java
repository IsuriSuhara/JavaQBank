package main.java.com.koboMagic.javaQBank.arrays;

//What will the following code print when compiled and run?
public class ElementNullArray {
    public void initData(String[] arr) {
        int ind = 0;
        for (String str : arr) {
            str.concat(str + " " + ind);
            ind++;
        }
    }

    public void printData(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        ElementNullArray ot = new ElementNullArray();
        String[] arr = new String[2];
//        System.out.println(arr[0]);
        ot.initData(arr);
        ot.printData(arr);
    }
}

//It will throw a RuntimeException at run time.

//When you do new String[2], you create a String array of two elements. arr is therefore not null.
// But each element of the array is not given any value and is therefore null. When you call a method on that element
// (i.e. str.concat(str+" "+ind); in initData), it will generate a NullPointerException, which is a RuntimeException.

//When you create an array of Objects ( here, Strings) all the elements are initialized to null.
//Note that. empty string is "" ( String str = ""; ) and is not same as null.

//Which of the following are benefits of an array over an ArrayList ?

//It consumes less memory.
////This is an ambiguous option because in certain situation an ArrayList may consume a little bit more memory than an
// array (because of additional internal data structure and pointers), while in some other situation it may consume less
// (when your array is only half full).

//Accessing an element in an array is faster than in ArrayList.
//Although very little, but a direct array access using an index is faster than calling a method on ArrayList

//Neither an ArrayList nor an array is thread safe. If you have multiple threads trying to add and remove elements from
// an ArrayList or an array, you have to write additional code to ensure thread safety.

//arrays do not implement Collection interface. ArrayList does. This is actually an advantage of an ArrayList over an array.

