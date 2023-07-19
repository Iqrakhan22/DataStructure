package stack;

import Linklist.LL;

import java.util.Stack;

public class usingLL {
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static class stack{

             public void push(int data){
                 Node newNode=new Node(data);
                  if(head == null){
                      head = newNode;
                      return;
                  }
                  newNode.next=head;
                  head=newNode;
             }
//             public void pushAtbottomRecursive(int data, Stack<Integer> s){
//                 if (isEmpty()){
//                     s.push(data);
//                     return;
//                 }
//                 int top=s.pop();
//                 pushAtbottomRecursive(data,s);
//                 s.push(top);
//             }

             public void pushAtBottom(int data){
                 Node newNode=new Node(data);
                 if(isEmpty()){
                     head = newNode;
                     return;
                 }
                 Node currNode=head;
                 while (currNode.next != null){
                     currNode=currNode.next;
                 }
                 currNode.next=newNode;
             }

             public boolean isEmpty(){
                 return head==null;
             }

             public int pop(){
                 if(isEmpty()){
                     return -1;
                 }
                 Node top = head;
                 head=head.next;
                 return top.data;
             }

             public void popAtBottom(){
                 if(isEmpty()){
                     return;
                 }
                 Node secondLast = head;
                 Node lastNode=head.next;
                 while (lastNode.next !=null){
                     lastNode=lastNode.next;
                     secondLast=secondLast.next;
                 }
                 secondLast.next=null;
             }

             public int peek(){
                 if(isEmpty()){
                     return -1;
                 }
//                 Node top=head; return top.data;
                 return head.data;
             }
        }
    }

    public static void main(String[] args) {
        Node.stack s=new Node.stack();
        s.push(1);
        s.push(23);
        s.push(87);
        s.push(543);

        s.pushAtBottom(12);
        s.pushAtBottom(10);

        s.popAtBottom();
        s.popAtBottom();

        s.pop();

        while (!s.isEmpty()){
            System.out.print(s.peek() + ",");
            s.pop();
        }
    }
}