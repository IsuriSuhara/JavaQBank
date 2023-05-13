package main.java.com.koboMagic.javaQBank.linked_list;

public class DoublyNode {

    Object value;
    DoublyNode next;
    DoublyNode Prev;

    public DoublyNode(Object value) {
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public void setPrev(DoublyNode prev) {
        Prev = prev;
    }

    public static DoublyNode insertNodeAtFront(DoublyNode head,Object value) {
        DoublyNode node = new DoublyNode(value);
        node.setNext(head);
        return node;
    }

    public static void printList(DoublyNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        while (node.next != null){
            DoublyNode nextNode = node.next;
            System.out.print(nextNode.value + " ");
            node = nextNode;
        }
    }

    public static void insertAfter(DoublyNode node, Object value){
        if (node == null) {
            return;
        }
        DoublyNode secondNode = new DoublyNode(value);
        DoublyNode firstNode = node;
        DoublyNode thirdNode = node.next;
        secondNode.setNext(thirdNode);
        secondNode.setPrev(firstNode);
        node.setNext(secondNode);
    }

    public static void main(String[] args) {
        DoublyNode a = new DoublyNode(10);
        DoublyNode b = new DoublyNode(20);
        DoublyNode c = new DoublyNode(30);

        a.setNext(b);

        b.setNext(c);
        b.setPrev(a);

        c.setPrev(b);
        DoublyNode node = insertNodeAtFront(a, 5);
//        printList(node);

        insertAfter(b, 25);
        printList(node);


    }
}
