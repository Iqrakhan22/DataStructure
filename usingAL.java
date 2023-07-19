package stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class usingAL {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();
        
        public void sort(){
            Collections.sort(list);
            for(int i: list)
            {
                System.out.println(i);
            }
        };
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if (isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
        
    }



    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(13);
        s.push(98);
        s.push(65);
        s.push(0);


        while (!s.isEmpty()){
            System.out.print(s.peek() + ",");
            s.pop();
        }
        s.sort();

    }
}
