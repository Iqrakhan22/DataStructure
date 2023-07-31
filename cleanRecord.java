package app;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class cleanRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enetr the elements of array: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int j,i,k;
        for ( i = 0; i < size; i ++)
        {
            for ( j = i + 1; j < size; j++)
            {
                if ( arr[i] == arr[j])
                {
                    for ( k = j; k < size - 1; k++)
                    {
                        arr[k] = arr [k + 1];
                    }
                    size--;

                    j--;
                }
            }
        }
        int count = 0;
        int res[] = new int[size];
        for ( i = 0; i < size; i++)
        {
            res[i] = arr[i];
            count++;
        }
        System.out.println(count);
        for ( i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ",");
        }
    }
}
