package Linklist;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String Data){
            this.data=Data;
            this.next= null;
            size++;
        }
    }

    //add First - Last
    //add First
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    //add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode =head;
        while (currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //Add in middle OR with index
    public void addInMiddle(int index, String data) {
        if(index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if(head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i=1; i<size; i++) {
            if(i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    //Print List
    public void printList(){
        if(head == null){
            System.out.println("list is empty :");
            return;
        }
        Node currNode =head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //Delete First
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty: ");
            return;
        }
        if(head.next == null){
            head=null;
        }

        size--;

        head=head.next;

    }
    //Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;

        if(head.next == null){
            head=null;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondlast =secondlast.next;
        }
        secondlast.next = null;
    }

    public int getSize() {
        return size;
    }

    //Iterative method
    public void reverse(){
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
    public void reverseList(){
        Node prevNode=null;
        Node nextNode=null;
        Node currentNode=head;

        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next=prevNode;
            //update
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public Node removeNfromLast(int n){
        Node curr=head;
        if(head.next==null) {
            return null;
        }
        int size=0;
        while(curr !=null){
            curr=curr.next;
            size++;
        }
        if(n==size){
            return head.next;
        }
        int indexToSearch=size-n;
        Node prev=head;
        for(int i=1;i<indexToSearch;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;

    }
    public boolean isLinklistHaveCycle(){
        Node fast=head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addLast("alfi");
        list.addLast("abid");
        list.addLast("zareena");
        list.addLast("saim");
        list.addLast("is");
        list.addLast("iqra");


        list.deleteFirst();
        list.deleteFirst();
//        list.addLast("beautiful");
//        list.addFirst("xyz");
//        list.addLast("khan");
//        list.addInMiddle(5,"IQRA");

        list.printList();
//
//        list.reverse();
//        list.printList();
//        System.out.println(list.removeNfromLast(4));
//        list.removeNfromLast(4);
//        System.out.println(list.isLinklistHaveCycle());

//        System.out.println(list.getSize());
//
//
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteFirst();
//        list.printList();
//
//        System.out.println(list.getSize());

    }

}
