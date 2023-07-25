package BinarySearch;

import java.util.Scanner;

public class SearchingIn2DSortedArray {
    public static void main(String[] args) {
//        arr =10 20 30 40 15 25 35 45 27 29 37 45 32 33 39 50
        Scanner sc =new Scanner(System.in);
        System.out.println("entre size of 2D Array n x m: ");
        int n =sc.nextInt(),m=sc.nextInt();

        int[][] arr=new int[n][m];
        System.out.println("Enter elements of 2D Array : ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Element to be searched : ");
        int search=sc.nextInt();

        int i = 0;
        int j=m-1;
        while ( i >= 0 && i < n || j >= 0 && j < n){
            if (arr[i][j] == search){
                System.out.println(i + "," + j);
                break;
            }
            else if (arr[i][j] > search) {
                j--;
            }
            else if (arr[i][j] < search) {
                i++;
            }
        }
    }
}
