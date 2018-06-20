package com.company;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void addFront(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }
    public void addAfter(int d,Node prev_node){
        Node new_node=new Node(d);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    public void addEnd(int d){
        Node new_node=new Node(d);
        if(head==null){
            head=new Node(d);
            return;
        }

        new_node.next=null;
        Node tnode=null;
        while(tnode.next!=null){
            tnode=tnode.next;
        }
        tnode.next=new_node;
    }
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }
}
