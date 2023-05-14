package main.java.com.koboMagic.javaQBank.stack_implementation.using_linked_lists;

import java.util.LinkedList;
import java.util.Queue;

public class StackAsLinkedList {

    StackNode top;

    static class StackNode{
        int data;
        StackNode next;

        StackNode(int data){
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        } else {
            return false;
        }
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if (top == null){
            top = newNode;
        } else {
            StackNode temp = top;
            top = newNode;
            newNode.next = top;
        }
        System.out.println(data + " pushed into stack");
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;
        if (top == null){
            System.out.println("Stack is Empty");
        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }


    public int peek(){
        if (top == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        StackAsLinkedList s1 = new StackAsLinkedList();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop() + " popped from stack");
        System.out.println("Top element is " +  s1.peek());
    }

}
