package BinarySearch;

public class NoSortedArrRotated {
    public static void main(String[] args) {
        int[] arr={11,12,15,18,1,2,5,6,8};

        int size=arr.length;
        int low=0;
        int high=size-1;
        int min=0;

        for (int i=0;i <=size-1; i++){
            int mid = low+((high-low)/2);
            if (arr[mid] < arr[high]){
                high = mid;
            }
            else if (arr[mid] > arr[high]) {
                low=mid+1;
            }
            min =mid;
        }

        System.out.println(arr[min]);
    }
}




//        int size=arr.length;
//        int minIndex=0;
//
//        int minElement=arr[0];
//        for (int i=1;i<size-1;i++){
//            minElement = Math.min( minElement, arr[i]);
//            if (minElement == arr[i]){
//                minIndex= i;
//            }
//        }
//        int NoToimesRotated = minIndex;
//
//        System.out.println(minIndex);