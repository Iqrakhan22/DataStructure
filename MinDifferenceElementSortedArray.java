package BinarySearch;

import java.util.Scanner;

public class MinDifferenceElementSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to be searched : ");
        int key = sc.nextInt();

        int[] arr={1,2,6,9,10,15,19,21,27};
        int size = arr.length;
        int low = 0;
        int high = size-1;

//        int min= Math.abs(arr[0]-key);  // 1-5  = 4

//        int min = 0;
        while(low <= high){

            int mid = low+ ((high-low)/2);         //mid =4;
            if(arr[mid] == key){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid] > key){
                high = mid-1;
            }
            else if (arr[mid] <key) {
                low=mid+1;
            }
        }
//        System.out.println(low + "," + high);

        int minDifference = Math.min(Math.abs(arr[low]-key),Math.abs(arr[high]-key));

//        System.out.println(arr[low]-key);
//        System.out.println(arr[high]-key);

        if (Math.abs(arr[low]-key) == Math.abs(arr[high]-key)){
            System.out.println(arr[low] + "," + arr[high] + " both element have Minimum And Same difference from key ");
        }
        else if (Math.abs(arr[low]-key) == minDifference){
            System.out.println(arr[low]);
        }
        else
            System.out.println(arr[high]);
//        System.out.println(Math.abs(minDifference));
    }
}
