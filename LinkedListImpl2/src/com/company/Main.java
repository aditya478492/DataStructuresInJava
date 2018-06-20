package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList lst=new LinkedList();
        lst.addEnd(10);
        lst.addBefore(9);
        lst.addBefore(8);
        lst.addBefore(7);
        lst.addBefore(6);
        //lst.deletePos(0);
        //lst.deleteList();
        //lst.Length();
        //lst.SearchElement(90);
        //lst.Nthnode(2);
        lst.MiddleElement();
        lst.printList();
    }
}
