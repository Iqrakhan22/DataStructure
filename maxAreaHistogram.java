package stack;

import javafx.util.Pair;

import java.util.Stack;

public class maxAreaHistogram {
    public static void main(String[] args) {

        Stack<Pair<Integer,Integer>> s=new Stack<>();
        Stack<Pair<Integer,Integer>> s1=new Stack<>();

//        int[] arr={6,2,5,4,5,1,6};
        int[] arr={7, 2, 6, 5, 6, 2, 7};
        int size=arr.length;
        int[] NSL=new int[size];
        int[] NSR=new int[size];

        for (int i=0;i<size;i++){
            Pair<Integer,Integer> p=new Pair<Integer,Integer>(arr[i] , i);

            if (s.isEmpty() == true){
                NSL[i] = -1;
            }
            else if (s.isEmpty() == false && arr[i] <= s.peek().getKey()){
                while (s.isEmpty() == false && arr[i] <= s.peek().getKey()){
                    s.pop();
                }
                if (s.size() == 0){
                    NSL[i] = -1;
                }
                else {
                    NSL[i] = s.peek().getValue();
                }
            }
            else if (s.isEmpty() == false && arr[i] > s.peek().getKey()){
                NSL[i] = s.peek().getValue();
            }
            s.add(p);
        }

        for (int i=size-1; i>=0 ; i--){
            if (s1.isEmpty() == true){
                NSR[i] = arr.length;
            }
            else if (!s1.isEmpty() && s1.peek().getKey() < arr[i]){
                NSR[i] = s1.peek().getValue();

            }

            else if (!s1.isEmpty() && arr[i] <= s1.peek().getKey()){

                while (!s1.isEmpty() && arr[i] <= s1.peek().getKey()){
                    s1.pop();
                }

                if (s1.size() == 0){
                    NSR[i] = arr.length;
                }
                else {
                    NSR[i] = s1.peek().getValue();
                }
            }
            Pair<Integer,Integer> p =new Pair<>(arr[i], i);
            s1.add(p);
        }
        int[] width=new int[size];
        int max = 0;
        for (int i=0;i< size;i++){
            for (int j=0;j< size;j++){
                width[i] = NSR[i]-NSL[i]-1;
                max = Math.max(max, width[i] * arr[i]);
            }
        }
        System.out.println(max);
    }
}
