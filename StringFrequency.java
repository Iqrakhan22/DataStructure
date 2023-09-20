package app;

public class StringFrequency {
    public static void arrayFrequency(int[] arr, int size){
        //arr={10,8,10,20,19,20,19,30,30};
        for (int i=0; i < size; i++){
            int count =1;
            for (int j=0; i < size; j++){
                if (j < i && arr[i] == arr[j]) break;
                if (arr[i] == arr[j] && i != j){
                    count++;
                }
                if ()
            }
        }
    }
    public static void main(String[] args) {
        String str = "iqrakhaiqrakhaniqalfi";
        int size = str.length();

        for (int i=0;i<size;i++){
            int count =1;
            for (int j=0;j<size;j++){
                if (j < i && str.charAt(i) == str.charAt(j)){
                    break;
                }
                if (str.charAt(i) == str.charAt(j) && i != j){
                    count++;
                }
                if (j == size-1){
                    System.out.print(str.charAt(i)+""+count);
                }
            }
        }
    }
}
