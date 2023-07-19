package sorting;
public class sorting {

    public static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }

    //BUBBLE SORT
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void insertionSort(int[] arr){
        //{10,9,8,7,6,5}
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }


    //MAIN
    public static void main(String[] args) {

        int[] a1={9,8,7,6,5,4,3,2,1};
//        System.out.println(a1.length);

        //BUBBLE SORT  O(n^2)
        System.out.println("Bubble Sort: ");
        bubbleSort(a1);

        System.out.println("");

        //SELECTION SORT  O(n^2)
        System.out.println("Insertion Sort:");
        insertionSort(a1);

    }


}

