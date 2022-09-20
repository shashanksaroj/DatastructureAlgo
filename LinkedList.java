package com.shashank.main;


public class LinkedList {



   static class Node {

        int data;

        Node next;

        Node(int d){

            data=d;
            next=null;

        }


    }
    LinkedList() {

        head = null;
    }


    Node head;
    void addvalue(int d){

        Node newnode=new Node(d);

   if(head==null)
       head=newnode;
   else
   {
       Node temp=head;

       while(temp.next!=null){

           temp=temp.next;


       }


       temp.next=newnode;

   }



    }
    
    void diplay(){
        
       Node temp=head;
       
       while(temp!=null){
           
           System.out.println(temp.data);
           
           temp=temp.next;
       }
        
        
        
    }
    public static void runll() {


        LinkedList linkedList=new LinkedList();


        linkedList.addvalue(4);
        linkedList.addvalue(6);
        linkedList.addvalue(8);
        linkedList.diplay();


    }
}