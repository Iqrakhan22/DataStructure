package BinarySearch;

import java.util.Scanner;

public class NextAlphabaticElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be search :");
        char key=sc.next().charAt(0);

//        System.out.println(key);
        char[] c={'a','c','e','f','i'};
        int size = c.length;
        int low=0;
        int high = size-1;

        while (low <= high){
            int mid = low + ((high-low)/2);

            if(key == c[mid]){
                if(mid + 1 == size){
                    System.out.println("NO element found ");
                    break;
                }else {
                    System.out.println(c[mid + 1]);
                    break;
                }
            }
            else if (key > c[mid]){
                low = mid+1;
            }
            else if (key < c[mid]){
                high = mid - 1;
            }
        }

    }
}
