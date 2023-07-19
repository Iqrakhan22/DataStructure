package Queue;

public class circularQArray {
    public static class circularQueue{
        int size;
        int rear;
        int front;
        int[] arr;
        circularQueue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
            front=-1;
        }
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)% size == front;
        }

        public void add(int data){
            if (isFull()){
                System.out.println("OVERFLOW");
                return;
            }
            if(front == -1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear] =data;
        }
        public int remove(){
            //if queue is empty
            if (isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            //if only 1 element
            if(front==rear){
                front=rear=-1;
            }
            else {
                front=(front+1)%size;
            }
            return result;
        }
        public int peek(){
            if (isEmpty()){
                return -1;
            }
//            front=(front+1)%size;
            return arr[front];
        }

    }

    public static void main(String[] args) {
        circularQueue q= new circularQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.add(6);
        q.remove();
        q.add(7);
//        System.out.println("peek"+q.peek());
//        q.remove();
//        System.out.println(q.peek());


        while(!q.isEmpty()) {
            System.out.print(q.remove() + ",");
        }



    }
}
