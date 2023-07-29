package app;

public class maxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
//        int[] height = {1,1};
        int low=0;
        int size = height.length;
        int high = size-1;
        int maxArea = 0;

        while (low < high){
            int min = Math.min(height[low],height[high]);
            int curArea = min * (high - low);
            maxArea = Math.max(maxArea,curArea);

            if(height[high] > height[low]){
                low++;
            }
            else {
                high--;
            }
        }

        System.out.println(maxArea);
    }
}


