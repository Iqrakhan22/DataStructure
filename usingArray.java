package Queue;
public class usingArray {
    public static class queue{
        int size;
        int[] arr;
        int rear;
        queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public boolean isFull(){
            return rear==size-1;
        }
        public void add(int data){
            if (isFull()){
                System.out.println("OVERFLOW");
            }
            rear++;
            arr[rear] = data;
        }
        public int remove(){
            if (isEmpty()){
                return -1;
            }
            int front=arr[0];
            for (int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q =new queue(5);
        q.add(21);
        q.add(65);
        q.add(90);
        q.remove();
        q.add(10);
        while (!q.isEmpty()){
            System.out.print(q.peek() + ",");
            q.remove();
        }
    }
}