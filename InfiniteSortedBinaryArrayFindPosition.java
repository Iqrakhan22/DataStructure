
// Find position of First 1 in Infinite Sorted Array

package BinarySearch;

public class InfiniteSortedBinaryArrayFindPosition {
    public static void main(String[] args) {
        int[] arr=new int[2000];
        int size=arr.length;
        int zero=(size/3)/5;
        for (int i=0;i<2000;i++) {
            if(i <= zero){
                arr[i] =0;
            }
            else {
                arr[i] =1;
            }
        }
        for (int i=0;i<2000;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(" ");


        int low=0;
        int high=10;

        while(low <= high){
            int mid = low + ((high-low)/2);
            if (arr[mid] == 1 && arr[mid-1] == 0){
                System.out.println("First Position of 1 is at "+mid + " position");
                break;
            }
            else if (arr[mid] ==0 ){
                high = high*2;
                low = mid;
            }
            else if(arr[mid] == 1){
                high = mid-1;
            }
        }
    }
}
