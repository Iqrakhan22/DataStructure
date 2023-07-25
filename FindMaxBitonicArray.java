package BinarySearch;

public class FindMaxBitonicArray {
    public static void main(String[] args) {
        int[] arr = {98,36,29,24,19,15,10,1,2,3,4,5,6,7};
        int size = arr.length;
        int low = 0;
        int high = size-1;


        while (low <= high){
            int mid = low + ((high - low)/2);
            if (mid >0 && mid<size-1){
                if (arr[mid] > arr[mid+1] && arr[mid] >arr[mid-1]){
                    System.out.println(arr[mid]);
                    break;
                }
                else if (arr[mid] < arr[mid+1]) {
                    low = mid+1;
                }
                else if (arr[mid] > arr[mid+1] && arr[mid]<arr[mid-1]){
                    high = mid - 1;
                }
            }
            else {
                int max = Math.max(arr[0],arr[size-1]);
                System.out.println(max);
                break;
            }

        }

    }
}
