package BinarySearch;

public class AllocateMinNoPages {
    public static boolean isValid(int[] arr,int size,int NoStudents,int mid){
        int Student = 1;
        int sum = 0;
        for (int i=0;i<size;i++){
            sum = sum + arr[i];
            if (sum > mid){
                Student++;
                sum = arr[i];
            }
        }
        if (Student > NoStudents){
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int size = arr.length;

        int low = 0;
        int high = 0;

        for (int i=0;i<size;i++){
            low = Math.max(low, arr[i]);
            high = high + arr[i];
        }
        int NoStudent = 2;
        int res = 0;

        if (NoStudent > size){
            System.out.println("INVALID!!!");
        }
        else {
            while (low <= high){
                int mid = low + ((high-low)/2);

                if (isValid(arr,size,NoStudent,mid) == true){
                    res = mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
        }

        System.out.println(res);
    }
}