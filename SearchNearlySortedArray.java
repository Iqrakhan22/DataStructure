package BinarySearch;

import java.util.Scanner;

public class SearchNearlySortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter element ot be search : ");
        int search = sc.nextInt();

        int[] arr={10,5,30,40,55,50,60,70,85,80,90,100};
        int size=arr.length;
        int low=0;
        int high=size-1;

        for (int i=0;i<=size;i++){
            int mid = low + ((high-low)/2);

            if (arr[mid] == search){
                System.out.println("found element " + arr[mid] + " at " +mid + " position.");
                break;
            } else if (arr[mid-1] == search) {
                System.out.println("found element " + arr[mid-1] + " at " +(mid-1) + " position.");
                break;
            } else if (arr[mid+1] == search) {
                int positin = mid+1;
                System.out.println("found element " + arr[mid+1] + " at " +positin + " position.");
                break;
            } else if (arr[mid] > search || arr[mid-1] > search || arr[mid+1] > search ) {
                high=mid-1;
            }else if (arr[mid] < search || arr[mid-1] < search || arr[mid+1] < search ) {
                low=mid;
            }
        }
    }
}
