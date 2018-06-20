package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList lst=new LinkedList();
        lst.addEnd(10);
        lst.addFront(4);
        lst.addFront(6);
        lst.addFront(7);
        //lst.addAfter(8,lst.head.next);
        lst.printList();
    }
}
