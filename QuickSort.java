package sorting;

public class QuickSort {

static int partition (int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++){
        if (arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return (i + 1);
}

    public static void quick(int arr[], int low, int high){
        if (low < high){
            int p = partition(arr, low, high);
            quick(arr, low, p - 1);
            quick(arr,p + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {76,2,4,6,642,3,90,432,12,32,11,0};
        int size  = arr.length;

        for (int i =0;i<size;i++){
            System.out.print(arr[i] + ",");
        }
        quick(arr,0,size-1);
        System.out.println(" ");

        for (int i =0;i<size;i++){
            System.out.print(arr[i] + ",");
        }

    }
}
