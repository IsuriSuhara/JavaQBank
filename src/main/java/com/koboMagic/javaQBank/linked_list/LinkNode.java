package main.java.com.koboMagic.javaQBank.linked_list;

public class LinkNode {

    Object value;
    LinkNode next;

    public LinkNode(Object val) {
        this.value = val;
        this.next = null;
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

    public void setNext(LinkNode next) {
        this.next = next;
    }

    public static void findAndDeleteByValue(LinkNode node, Integer value) {
        if (node == null) {
            return;
        }
        if (node.value != value) {
            System.out.println(node.value);
        }

        findAndDeleteByValue(node.next, value);

    }

    public static void printLinkedList(LinkNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        while (node.next != null) {
            node = node.next;
            System.out.print(node.value + " ");
        }
    }

    public static void deleteNode(LinkNode node, Integer value) {
        if (node == null) {
            return;
        }
        if(node.value == value){
            node=node.next;
        }

        LinkNode temp = node;
        LinkNode prev = null;
        while(temp.value != value){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        LinkNode a = new LinkNode(10);
        LinkNode b = new LinkNode(20);
        LinkNode c = new LinkNode(30);
        LinkNode d = new LinkNode(40);
        LinkNode e = new LinkNode(50);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        printLinkedList(a);

        deleteNode(a, 30);
        printLinkedList(a);


//        findAndDeleteByValue(a,30);

//        deleteNode(c);


    }
}
