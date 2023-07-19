package Queue;
public class usingLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public static class queue{
            Node head;
            public boolean isEmpty(){
                return head == null;
            }
            public void addLast(int data){
                Node newNode = new Node(data);
                if (head == null){
                    head = newNode;
                    return;
                }
                Node curNode=head;
                while (curNode.next != null){
                    curNode = curNode.next;
                }
                curNode.next=newNode;
            }

            public void deleteFirst(){
                if (head == null){
                    return;
                }
                if (head.next == null){
                    head = null;
                }
                head=head.next;
            }
            public void printList(){
                if (head == null){
                    System.out.println("List is empty");
                    return;
                }
                Node curNode=head;
                while (curNode != null){
                    System.out.print(curNode.data + "->");
                    curNode=curNode.next;
                }

            }
            public int peek(){
                if (head == null){
                    return -1;
                }
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Node.queue q =new Node.queue();
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);q.addLast(5);
        q.addLast(6);


//        while (!q.isEmpty()){
//            System.out.print(q.peek() +",");
//            q.deleteFirst();
//        }
        q.printList();

        System.out.println(" ");
        System.out.println(q.peek());;
        q.deleteFirst();
        q.deleteFirst();
        System.out.println(" ");
        q.printList();

        System.out.println(" ");
        System.out.println(q.peek());

    }

}