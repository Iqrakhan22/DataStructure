package stack;

import java.util.Stack;

public class largestNextNumber {
    public static void main(String[] args) {

        Stack<Integer> s=new Stack<>();
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int size=arr.length;
        int[] resArr=new int[size];
        for(int i=size-1; i>=0; i--){

            if (s.isEmpty() == true){
//                s.add(arr[i]);
                resArr[i] = -1;
            }
            else if (s.isEmpty()==false && s.peek() > arr[i]){
                resArr[i] = s.peek();
//                s.add(arr[i]);
            }
            else if (s.isEmpty()==false && s.peek()<= arr[i]){
                while (s.isEmpty()==false && s.peek()<= arr[i]){
                    s.pop();
                }
                if (s.size()==0){
                    resArr[i] = -1;
                }
                else {
                    resArr[i]=s.peek();
                }

            }
            s.add(arr[i]);
        }
        for(int x:resArr){
            System.out.print(x+ ",");
        }

    }
}
