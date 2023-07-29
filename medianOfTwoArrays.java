package app;

import java.util.Arrays;

public class medianOfTwoArrays {
    public static void main(String[] args) {
            int[] nums1={3};
            int[] nums2={-1,-2};

            int nums1Len=nums1.length;
            int nums2Len=nums2.length;
            int mergeLen=nums1Len + nums2Len;

            int[] Merge = new int[mergeLen];

            System.arraycopy(nums1, 0, Merge, 0, nums1Len);
            System.arraycopy(nums2, 0, Merge, nums1Len, nums2Len);

            Arrays.sort(Merge);

            for (int i=0;i<mergeLen;i++){
                System.out.print(Merge[i] +",");
            }
            System.out.println(" ");

//        float median;
//        double meadian;
            if(mergeLen %2 == 0){
                int mid = (0+(mergeLen-1)/2);
                float num1=Merge[mid];
                float num2 = Merge[mid+1];
                float median = (num1+num2)/2;
                System.out.println(num1 + "," + num2);
                System.out.println(median);
                System.out.println(median);
            }
            else{
                int median = (0 + mergeLen-1)/2;
//            System.out.println(Merge[0] +  "," + Merge[mergeLen-1]);
                median = Merge[median];
                System.out.println(median);
            }
//        int res = (int) findMedianSortedArrays(nums1,nums2);
//        System.out.println(res);
    }
}
