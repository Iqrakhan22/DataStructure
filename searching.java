package Linklist;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter total count of elements -> ");
        int num = sc.nextInt();

        while(num>0) {
            list.add(sc.nextInt());
            num--;
        }
        sc.close();
        System.out.println(list);

        int n=25;
        for(int i=0;i< list.size();i++){
            if((int)list.get(i) > n){
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
//        list.addFirst(3);
//        list.addFirst(2);
//        list.addFirst(8);
//        list.addFirst(3);
//        list.addFirst(7);
//        list.addFirst(5);
//        list.addFirst(1);
//        System.out.println(list);
//        int search =5;
//
//        for(int i=0;i<list.size()-1;i++){
//            if(search == list.get(i)){
//                System.out.println("searching element is " + search +" at index " + i);
//            }
//        }



    }
}
