package sorting;

public class bubbleSort {
    public static void BubbleSort(int[] arr, int size){
        for (int i=0; i < size;i++){
            for (int j=0; j < size-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {76,12,32,1,3,45,100};
        int size = arr.length;

        // Complexity  :  n  ,  n^2  ,  n^2
        BubbleSort(arr, size);
        for (int i = 0;i < size; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
