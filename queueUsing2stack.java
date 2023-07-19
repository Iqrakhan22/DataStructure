package Queue;

import java.util.Stack;

public class queueUsing2stack {
    public static class queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public void remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            s1.pop();
        }
        public int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());

//        while (!q.isEmpty()){
//            System.out.print(q.peek() + ",");
//            q.remove();
//        }
    }
}
