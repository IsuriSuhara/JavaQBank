package main.java.com.koboMagic.javaQBank.lambda_expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {

        boolean b = checkList(new ArrayList(), al -> al.isEmpty());

//        boolean c =checkList(new ArrayList(), ArrayList al -> al.isEmpty());
        boolean c = checkList(new ArrayList(), (List al) -> al.isEmpty());

//        boolean e =checkList(new ArrayList(), al -> return al.size() == 0);
        boolean e = checkList(new ArrayList(), al -> {
            return al.size() == 0;
        });

        boolean g = checkList(new ArrayList(), al -> al.add("hello"));

//        boolean h =checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());
        boolean h = checkList(new ArrayList(), (List al) -> al.isEmpty());

        System.out.println(b);
    }
}


//The test method of Predicate returns a boolean. So all you need for your body part in your lambda expression is an
// expression that returns a boolean. isEmpty() is a valid method of ArrayList, which returns true if there are no
// elements in the list. Therefore, al.isEmpty() constitutes a valid body for the lambda expression in this case.
//You need to put the parameter list of the lambda expression in brackets if you want to use the parameter type.
//Remember that specifying the parameter type is optional ( as shown in option 1) because the compiler can figure
// out the parameter types by looking at the signature of the abstract method of any functional interface (here,
// Predicate's test method).
//You need to put the body withing curly braces if you want to use the return keyword.
//The add method of ArrayList returns a boolean. Further, it returns true if the list is altered because of the call to add.
// In this case, al.add("hello") indeed alters the list because a new element is added to the list.
//Predicate is typed to List (not ArrayList) in the checkList method, therefore, the parameter type in the
// lambda expression must also be List. It cannot be ArrayList.
