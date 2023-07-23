package BinarySearch;

import java.util.Scanner;

public class BSearch {
    //        ASCENDING ORDER
    public static void AscendingOrder(int[] arr){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Element to be searched : ");
        int search=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        for (int i=0;i< arr.length/2;i++){
            int mid=low+((high-low)/2);
            if (arr[mid] == search){
                System.out.println("found element " + arr[mid] + " at " +mid + " position.");
                break;
            }
            else if (arr[mid] < search){
                low=mid+1;
            }
            else if (search < arr[mid]){
                high=mid-1;
            }
            else{
                System.out.println("element not found");
            }
        }
    }

    //DECSENDING ORDER
    public static void DecsendingOrder(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element to be searched : ");
        int search=sc.nextInt();
        int low=0;
        int high= arr.length-1;

        for (int i=0;i<arr.length/2;i++){

            int mid = low+((high-low)/2);

            if (arr[mid] == search){
                System.out.println("Element " + arr[mid] + " found at " + mid + " position");
                break;
            }
            else if (arr[mid] < search){
                high=mid-1;
            }
            else if (arr[mid] > search){
            low = mid+1;
            }
            else {
                System.out.println("Element NOT found ");
            }
        }
    }
    public static void main(String[] args) {
        // ORDER NOT KNOWN SEARCH
//        int[] arr ={91,72,56,38,23,16,12,8,5,2};
        int[] arr={1,2,3,4,5,6,7,89,100};

//        if (arr.length== 1) break;
        if(arr[0] < arr[1]){
            AscendingOrder(arr);
        }
        else if (arr[0] > arr[1]){
            DecsendingOrder(arr);
        }

    }
}







