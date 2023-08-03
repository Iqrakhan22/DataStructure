package sorting;
public class MergeSort {
    static void merge(int[] arr, int low, int mid, int high){
        int l1 = mid - low + 1;
        int l2 = high - mid;

        int[] a = new int[l1];
        int[] b = new int[l2];

        for (int i = 0; i < l1; ++i){
            a[i] = arr[low + i];
        }
        for (int j=0;j < l2; ++j){
            b[j] = arr[mid + 1 + j];
        }
        int i =0;int j=0;
        int k = low;
        while (i < l1 && j < l2){
            if (a[i] <= b[j]){
                arr[k] = a[i];
                i++;
            }
            else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < l1){
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < l2){
            arr[k] = b[j];
            j++;
//            i++
            k++;
        }
    }
    static void sort(int[] arr, int low, int high){
        if (low < high){
            int mid = low + (high - low) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {87,13,1,43,1,7,43,2,1,123,43};
        int size = arr.length;

        System.out.println("Initial Array : ");
        for (int i=0; i < size; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();

//        MergeSort ms = new MergeSort();
//        ms.sort(arr, 0, size-1);

        // COMPLEXITY nlogn for all
        sort(arr, 0, size-1);

        System.out.println("Sorted Array : ");
        for (int i=0; i < size; i++){
            System.out.print(arr[i] + ",");
        }
    }
}