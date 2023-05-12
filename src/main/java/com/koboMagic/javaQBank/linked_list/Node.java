package main.java.com.koboMagic.javaQBank.linked_list;

public class Node {

    public Object value;
    public Node next;

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public static Node printLinkedList(Node head) {
        System.out.println(head.value);
        if (head.next == null) {
            return null;
        }
        return printLinkedList(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        printLinkedList(a);
    }
}
