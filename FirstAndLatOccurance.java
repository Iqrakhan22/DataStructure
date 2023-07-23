package BinarySearch;

import java.util.Scanner;

public class FirstAndLatOccurance {
    public static void main(String[] args) {


        int[] arr = {2, 4, 10, 10, 10, 10, 11, 11, 12, 12, 13, 14, 16, 18, 20};
        int size = arr.length;
//        int[] res=new int[size];
//        int res;

        int low = 0;
        int high = size - 1;

        System.out.println("Element to be search : ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();

        int FirstOccurance = -1;
        int LastOccurance = -1;
        int count = 0;

        int mid = 0;
        for (int i = 0; i < size / 2; i++) {
            mid = low + ((high - low) / 2);
            if (search == arr[mid]) {
                FirstOccurance = mid;
                high = mid - 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }

        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < size / 2; i++) {
            int center = start + ((end - start) / 2);
            if (arr[center] == search) {
                LastOccurance = center;
                start = center + 1;
            } else if (arr[center] > search) {
                end = center - 1;
            } else if (arr[center] < search) {
                start = center + 1;
            }
        }

        System.out.println("First Occurance is at "+FirstOccurance);
        System.out.println("Last Occurance is at "+LastOccurance);

        count = (LastOccurance-FirstOccurance)+1;
        System.out.println("count = " + count);
    }
}
