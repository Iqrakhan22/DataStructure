package stack;

import java.util.Stack;

public class collectionStack {
    public static void pushAtBottom( int data, Stack<Integer> stack){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
        
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(123);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverseStack(stack);
//        pushAtBottom(4,stack);
        while (!stack.isEmpty()){
            System.out.print(stack.peek() + ",");
            stack.pop();
        }



    }
}
