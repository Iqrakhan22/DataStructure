package stack;

import java.util.Stack;

public class nearestSmallerFromRight {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int size = arr.length;
        int[] res=new int[size];

        for(int i=size-1; i>=0 ; i--){
            if(s.isEmpty() == true){
                res[i] = -1;
            }
            else if (s.isEmpty() == false && arr[i] <= s.peek()){
                while (s.isEmpty() == false && arr[i] <= s.peek()){
                    s.pop();
                }
                if (s.size() == 0){
                    res[i] = -1;
                }
                else {
                    res[i] = s.peek();
                }
            }
            else if (s.isEmpty() == false && s.peek() < arr[i]){
                res[i] = s.peek();
            }
            s.add(arr[i]);
        }

        for (int x: res){
            System.out.print(x + ",");
        }
    }
}
