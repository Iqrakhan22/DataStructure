package sorting;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        //{10,9,8,7,6,5}
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] a1={9,8,7,6,5,4,3,2,1};

        //SELECTION SORT  O(n^2) for all
        System.out.println("selection Sort:");
        selectionSort(a1);

    }


}

