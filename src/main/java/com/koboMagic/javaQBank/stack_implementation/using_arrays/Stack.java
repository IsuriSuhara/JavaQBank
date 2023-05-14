package main.java.com.koboMagic.javaQBank.stack_implementation.using_arrays;

public class Stack {
    int top;
    static final int MAX = 5;
    int arr[] = new int[MAX];//maximum size of stack

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top--];
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(30);
        s.push(30);
//        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
        System.out.println("Is Empty: " + s.isEmpty());
    }
}
