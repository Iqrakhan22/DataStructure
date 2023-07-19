package stack;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class stackUsing2Queue {
    public static class Stack{
       Queue<Integer> q1=new ArrayDeque<>();
        Queue<Integer> q2=new ArrayDeque<>();

        public void insert(int data){
            q2.add(data);

            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q=q1;
            q1=q2;
            q2=q;
        }
        public void pop(){
            if (q1.isEmpty()){
                return;
            }
            q1.remove();
        }
        public int top(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.peek();
        }
        public boolean isEmpty(){
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();

        s.insert(1);
        s.insert(2);
        s.insert(3);
        s.insert(4);
        s.insert(5);

        while (!s.isEmpty()){
            System.out.print(s.top() +  ",");
            s.pop();
        }
    }
}