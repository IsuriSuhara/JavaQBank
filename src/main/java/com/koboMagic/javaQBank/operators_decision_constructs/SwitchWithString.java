package main.java.com.koboMagic.javaQBank.operators_decision_constructs;

public class SwitchWithString {
    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "c":
                System.out.println("cat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        SwitchWithString tc = new SwitchWithString();
        tc.switchString("c");
    }
}


//Since there is a case condition that matches the input string "c", that case statement will be executed directly.
// This prints "cat". Since there is no break after this case statement and the next case statement, the control will
// fall through the next one (which is default : ) and so "none" will be printed as well.
//The switch statement compares the String object in its expression with the expressions associated with each case
// label as if it were using the String.equals method; consequently, the comparison of String objects in switch
// statements is case sensitive. The Java compiler generates generally more efficient bytecode from switch statements
// that use String objects than from chained if-then-else statements.

//long, float, double, and boolean can never be used as a switch variable.

//Here are the rules for a switch statement:
//1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums
// can be used as types of a switch variable. (String is allowed only since Java 7).
//2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class
// String, your case labels must use Strings as well.
//3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of
// type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
//4. All case labels should be COMPILE TIME CONSTANTS.
//5. No two of the case constant expressions associated with a switch statement may have the same value.
//6. At most one default label may be associated with the same switch statement.
