package sorting;

public class insertionSort {
    public static void InsertionSort(int[] arr, int size){

        for (int i = 1;i<size;i++){
            int x = arr[i];
            int j = i-1;
            while ((j > -1) && (arr[j] > x)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 76, 6, 5, 4, 3, 2, 1};
        int size = arr.length;

        // Complexity  :  n  ,  n^2  ,  n^2
        InsertionSort(arr, size);
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
