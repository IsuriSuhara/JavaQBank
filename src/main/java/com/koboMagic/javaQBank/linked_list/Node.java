package main.java.com.koboMagic.javaQBank.linked_list;

import java.util.ArrayList;
import java.util.List;

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

    public static Node printLinkedList(Node head, List list) {
        System.out.println(head.value);
        list.add(head.value);
        if (head.next == null) {
            System.out.println(list);
//            System.out.println(list.stream().mapToInt(i -> i).sum());
            return null;
        }
        return printLinkedList(head.next, list);
    }

    public static Boolean linkedListFind(Node head, Integer val, Integer count) {
        if (head.value == null) return false;
        if (head.value == val) {
            System.out.println(val);
            System.out.println(count);
            return true;
        }
        count++;
        return linkedListFind(head.next, val, count);
    }

    public static Boolean linkedListFindByIndex(Node head, Integer index) {
        if (head.value == null) return false;
        if (index == 0) {
            System.out.println(head.value);
            return true;
        }
        return linkedListFindByIndex(head.next, --index);
    }

    public static Node reverseList(Node head, Node prev) {
        if (head == null) {
            System.out.println(prev.value);
            return prev;
        }
        Node temp = head.next;
        head.next = prev;
        return reverseList(temp, head);

    }

    public static void zipperList(Node head1, Node head2, Integer count, List list) {
        if (head1 == null || head2 == null) {
            if (head1 == null && head2 == null) {
                System.out.println(list);
                return;
            }
            if (head1 == null && head2 != null) {
                list.add(head2.value);
                count++;
                zipperList(head1, head2.next, count, list);
            }
            if (head2 == null && head1 != null) {
                list.add(head1.value);
                count++;
                zipperList(head1.next, head2, count, list);
            }
        } else {
            if (count % 2 == 0) {
                list.add(head1.value);
                count++;
                zipperList(head1.next, head2, count, list);
            } else {
                list.add(head2.value);
                count++;
                zipperList(head1, head2.next, count, list);
            }
        }
    }

    public static Node zip(Node head1, Node head2, List list) {
        if (head1 == null || head2 == null) {
            if (head1 == null && head2 == null) {
                System.out.println(list);
            }
            if (head1 == null && head2 != null) {
                list.add(head2.value);
                return zip(head1, head2.next, list);
            }
            if (head2 == null && head1 != null) {
                list.add(head1.value);
                return zip(head1.next, head2, list);
            }
            return null;
        } else {

            list.add(head1.value);
            Node temp = head1;
            head1 = head2;
            head2 = temp;

            return zip(head1, head2.next, list);
        }
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
//        printLinkedList(a, new ArrayList<Object>());
//        linkedListFind(a, 20, 0);
//        linkedListFindByIndex(a, 3);
//        reverseList(a, null);
        Node q = new Node(50);
        Node r = new Node(60);
        q.setNext(r);

//        zipperList(a, q, 0, new ArrayList<Object>());
        zip(a, q, new ArrayList<Object>());

    }
}

//n = # of nodes
//traversal time complexity: O(n)
//traversal space complexity: O(n)
