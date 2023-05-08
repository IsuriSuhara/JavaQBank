package main.java.com.koboMagic.javaQBank.string_stringbuilder;

public class ConcatVsAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("IZO");
        sb.append("-808");
//        sb.concat("-808");
        System.out.println(sb);
    }
}


//Code fails to compile because there is no method called concat present in the StringBuilder class. The concat method
// lies in String class. Hence, option E is correct. Here, we should have used append method of StringBuilder class,
// in that case, option B would be correct.