package app;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNoInRange {
    public static void main(String[] args) {
        int[] arr = {11,13,12,15,14,16,17,19,20};
        int size = arr.length;

        int min = arr[0], max = 0;

        for (int i = 0; i < size; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        Arrays.sort(arr);

        int ActualSize=0;
        for (int i=min;i<=max;i++){
            ActualSize++;
        }
        int search=min+1;

        if (ActualSize > size){
            for (int i = 1; i < size-1; i++) {
                if(arr[i] != search){
                    System.out.print("Missing Number is : " + search);
                    break;
                }
                else{
                    search = search+1;
                }
            }
        }
        else if (ActualSize == size){
            int missingNum=min-1;
            System.out.println(missingNum);
        }

    }
}
