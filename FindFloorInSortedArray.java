package BinarySearch;

import java.util.Scanner;

public class FindFloorInSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element whos floor is to be searches : ");
        double searchFloor;
        searchFloor= sc.nextDouble();
        int[] arr={1,2,3,4,5,6,7};
        int size=arr.length;
        int low=0;
        int high=size-1;

        while(low <= high){
            int mid=low +((high-low)/2);
            if (arr[mid] > searchFloor){
                high = mid-1;
            }
            else if(arr[mid] < searchFloor && arr[mid+1] >searchFloor || arr[mid] == searchFloor){
                System.out.println(arr[mid]);
                break;
//
            } else if (arr[mid] < searchFloor) {
                low = mid;
//                System.out.println(arr[mid]);
            }
            else {
                System.out.println("element NOT found");
            }
        }
    }
}
