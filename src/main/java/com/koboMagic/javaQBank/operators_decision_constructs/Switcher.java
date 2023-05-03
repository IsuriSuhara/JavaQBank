package main.java.com.koboMagic.javaQBank.operators_decision_constructs;

//What will the above program print if compiled and run using the following command line: java Switcher 1 2 3
public class Switcher {
    public static void main(String[] args) {
        switch(Integer.parseInt(args[0]))  //1
        {
            case 0 :
                boolean b = false;
                System.out.println(b);
                break;

            case 1 :
                b = true; //2
                System.out.println(b);//b is in scope for the rest of the switch block.
                break;
        }

//        if(b) System.out.println(args[2]);//uncomment and see
    }
}
