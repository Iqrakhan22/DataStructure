package reverseArray;
import java.util.Arrays;
public class reverseArrayProblem {

    public int[] solve(int[] nums) {
        int lowerindex = 0;
        int higherindex = nums.length - 1;

        while (lowerindex < higherindex) {
            swap(nums, lowerindex, higherindex);
            lowerindex++;
            higherindex--;
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }
}

// no need for extra memory (in-place algorithm)
        // O(N/2) = O(N) linear running time
//        public int[] solve(int[] nums) {
//
//            int lowIndex = 0;
//            int highIndex = nums.length-1;
//
//            while(lowIndex < highIndex) {
//                swap(nums, lowIndex, highIndex);
//                lowIndex++;
//                highIndex--;
//            }
//
//            return nums;
//        }
//
//        private void swap(int[] nums, int index1, int index2) {
//            int temp = nums[index1];
//            nums[index1] = nums[index2];
//            nums[index2] = temp;
//        }
//    }

//}
