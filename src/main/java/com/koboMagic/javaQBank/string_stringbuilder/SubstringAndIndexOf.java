package main.java.com.koboMagic.javaQBank.string_stringbuilder;

//Which line will print the string "MUM"?
public class SubstringAndIndexOf {
    public static void main(String[] args) {
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7));//1
        System.out.println(s.substring(5));//2
        System.out.println(s.substring(s.indexOf('I', 3)));//3
        System.out.println(s.substring(s.indexOf('I', 4))); //4
    }
}

//1: answer
//2: It will print UM.
//3: It will print IMUM. as s.indexOf('I', 3) will return 3.
//4: It will throw an exception as s.indexOf('I', 4) will return -1

//String substring(int beginIndex)
//        Returns a new string that is a substring of this string.
//String substring(int beginIndex, int endIndex)
//        Returns a new string that is a substring of this string.
//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
// Thus the length of the substring is endIndex-beginIndex.
//
//int indexOf(int ch)
//        Returns the index within this string of the first occurrence of the specified character.
//int indexOf(int ch, int fromIndex)
//        Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
//int indexOf(String str)
//        Returns the index within this string of the first occurrence of the specified substring.
//int indexOf(String str, int fromIndex)
//        Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.