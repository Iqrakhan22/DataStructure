package BinarySearch;

import java.util.Scanner;

public class PositionOfElementInInfiniteSortedArray {
    public static int mainFunction(int[] arr,int low,int high,int search){
        int size=arr.length;
        for (int i=0;i<size/2;i++){
            int mid = low + ((high - low)/2);
            if (arr[mid] == search){
                return mid;
            }
            else if (arr[mid] > search){
                high=mid-1;
            }
            else if (arr[mid] < search) {
                high = high * 2;
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[20000];
        for (int i=0;i<20000;i++) {
            arr[i] = (i*2/5);
        }
        for (int i=0;i<2000;i++) {
            System.out.print(arr[i] + ",");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("element to be searched : ");
        int search = sc.nextInt();

        int high = search;
        int positon = mainFunction(arr,0,search,search);
        System.out.println(positon);

    }
}
