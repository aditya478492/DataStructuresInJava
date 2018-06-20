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
    public void addBefore(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }
    public void printList(){
        Node tnode=head;
        while(tnode!=null){
            System.out.print(tnode.data+" ");
            tnode=tnode.next;
        }
    }
    public void delete(int d){
        Node tnode=head;
        if(tnode.data==d){
            head=tnode.next;
            return;
        }
        while(tnode.next.data!=d){
            tnode=tnode.next;
        }
        tnode.next=tnode.next.next;
    }
    public void deletePos(int p){
        int count=1;
        Node tnode=head;
        if(p==0){
            head=tnode.next;
            return;
        }
        while(count!=p){
            tnode=tnode.next;
            count++;
        }
        tnode.next=tnode.next.next;
    }
    public void deleteList(){
        head=null;
    }
    public void Length(){
        Node tnode=head;
        int count=0;
        while(tnode!=null){
            tnode=tnode.next;
            count++;
        }
        System.out.println("Length of list is :"+count);
    }
    public void SearchElement(int e){
        Node tnode=head;
        while(tnode.next!=null){
            tnode=tnode.next;
        }
        if(tnode.data==e){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
    public void Nthnode(int n){
        Node tnode=head;
        int count=0;
        while(count!=n){
            count++;
            tnode=tnode.next;
        }
        System.out.println(n+1+" element is:"+tnode.data);
    }
    public void MiddleElement(){
        Node tnode=head;
        int count=0;
        while (tnode!=null){
            count++;
            tnode=tnode.next;
        }
        tnode=head;
        count=count/2;
        while(count!=0){
            count--;
            tnode=tnode.next;
        }
        System.out.println("Middle element :"+tnode.data);
    }
}
