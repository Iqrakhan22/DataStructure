package BinarySearch;

import java.util.Scanner;

public class SearchingInBitonicArray {
    public static int maxElement(int[] arr,int size){
//        int size = arr.length;
        int low = 0;
        int high = size-1;
        int max = 0;
        while(low <= high){
            int mid=low+((high-low)/2);
            if (mid > 0 && mid < size-1){
                if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                    return mid;
                }
                else if (arr[mid] < arr[mid+1]){
                    low = mid+1;
                }
                else if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
                    high = mid-1;
                }
            }
            else {
                max = Math.max(arr[0],arr[size-1]);
                continue;
            }
        }
        if (arr[0] == max){
            return 0;
        }
        else return size-1;

//        return -1;
    }
    public static int BSAscending(int[] arr,int low,int high,int search){
        while (low <= high){
            int mid = low+ ((high-low)/2);
            if (arr[mid] == search){
                return mid;
            }
            else if(arr[mid] > search){
                high = mid - 1;
            }
            else if(arr[mid] < search){
                low = mid+1;
            }
        }
        return -1;
    }
    public static int BSDescending(int[] arr,int low,int high,int search){
        while (low <= high){
            int mid = low+((high-low)/2);
            if (arr[mid] == search){
                return mid;
            }
            else if (arr[mid] > search){
                low = mid+1;
            }
            else if (arr[mid] < search){
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {23,45,53,61,79,84,75,74,22,22,11};
        int size = arr.length;;
        int maxIndex = maxElement(arr,size);
//        System.out.println(maxIndex);

        Scanner sc = new Scanner(System.in);
        System.out.println("eneter element to be searche : ");
        int search = sc.nextInt();

        int searched1 = BSAscending(arr,0,maxIndex,search);
        int seardched2 = BSDescending(arr,(maxIndex+1),(size-1),search);

//        System.out.println(searched1 + "," + seardched2);

        if (searched1 ==-1){
            System.out.println(seardched2);
        }
        else if (searched1 !=-1 && seardched2 != -1) {
            System.out.println(searched1 + "," + seardched2);
        } else System.out.println(searched1);
    }
}
