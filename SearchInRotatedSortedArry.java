
package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedSortedArry  {
    public static int min(int[] arr){
        int size=arr.length;
        int low=0;
        int high=size-1;
        int min=0;

        for(int i=0;i<=size-1;i++){
            int mid = low + ((high-low)/2);

            if(arr[mid] > arr[high]){
                low=mid;
            }
            else if(arr[mid] < arr[high]){
                high = mid;
            }
            min = mid;
        }
        return min;
    }

    public static int BinarySearch(int[] arr,int low,int high,int search){
        int size=arr.length;

        // while(low <= high){}
        while(low <= high){
            int mid= low+((high-low)/2);
            if(arr[mid] == search){
                return mid;
                // System.out.println("found element " + arr[mid] + " at " +mid + " position.")
                // break;
            }
            else if (arr[mid] > search){
                high = mid - 1;
            }
            else if (arr[mid] < search){
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target= sc.nextInt();
        int[] nums = {3,1};
        int size = nums.length;


        int min=min(nums);
        System.out.println(min);
        int low = 0;
        int high = min-1;

        int start = min;
        int end = size-1;

         int FirstIndex=BinarySearch(nums, low, high, target);
         int SecondIndex= BinarySearch(nums, start, end, target);

        if(FirstIndex == -1 && SecondIndex == -1){
            System.out.println(SecondIndex);
        }
        else if (SecondIndex == -1){
            System.out.println(FirstIndex);
        }
        else {
            System.out.println(SecondIndex);
        }
    }
}


