package stack;

import javafx.util.Pair;
import java.util.Stack;

public class stockSpanProblem {
    public static void main(String[] args) {

        int[] arr = {100,60,70,65,80,85};
//        int[] arr = {100, 80, 70, 60, 70, 75, 85};
        Stack<Pair<Integer, Integer>> s = new Stack<>();

        int size = arr.length;
        int res[] = new int[size];
        int temp,count=0;

        for (int i = 0; i < size; i++) {

            if (s.isEmpty() == true) {
                res[i] = 1;

            } else if (s.isEmpty() == false && s.peek().getKey() > arr[i]) {
                temp = s.peek().getValue();
                res[i] = i - temp;

            } else if (s.isEmpty() == false && s.peek().getKey() <= arr[i]) {
                while (s.isEmpty() == false && s.peek().getKey() <= arr[i]) {
                    s.pop();
                    count++;
                }
//                System.out.println(count);
                if (s.size() == 0) {
//                    temp = s.peek().getValue();
                    res[i] =count + 1;  //No geater element, therefore -1;
                }
                else {
                    temp = s.peek().getValue();
                    res[i] = i - temp;        //print index of stack peek
                }
            }
            Pair<Integer, Integer> p = new Pair<Integer, Integer>(arr[i], i);
            s.add(p);        //add values in the stack
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(res[i] + ",");
        }
    }
}

