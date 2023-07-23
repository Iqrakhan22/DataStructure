package BinarySearch;

import java.util.Scanner;

public class FindFloorAndCeilInSortedArray {
    
    public static int FindFloor(int[] arr, int low, int high, double searchFloor){
        while(low <= high){
            int mid=low +((high-low)/2);
            if (arr[mid] > searchFloor){
                high = mid-1;
            }
            else if(arr[mid] < searchFloor && arr[mid+1] >searchFloor || arr[mid] == searchFloor){
                return arr[mid];
//
            } else if (arr[mid] < searchFloor) {
                low = mid;
//                System.out.println(arr[mid]);
            }
        }
        return -1;
    }
    public static int FindCeil (int[] arr,int low,int high,double searchCeil){
        while (low <= high){
            int mid = low + ((high-low)/2);
            if(arr[mid] > searchCeil && arr[mid - 1] < searchCeil || arr[mid] == searchCeil){
                return arr[mid];
//                break;
            } else if (arr[mid] < searchCeil) {
                low = mid + 1;
            } else if (arr[mid] > searchCeil) {
                high=mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element whos floor  and ceil is to be searches : ");
        double searchCeil = sc.nextDouble();
        double searchFloor= sc.nextDouble();

        int[] arr={1,2,3,4,5,6,7};
        int size=arr.length;
//        int low=0;
//        int high=size-1;
        int ceil = FindCeil(arr,0,size-1,searchCeil);
        int floor=FindFloor(arr,0,size-1,searchFloor);
        System.out.println(ceil + "," + floor );
    }
}


// FLOOR of an element

