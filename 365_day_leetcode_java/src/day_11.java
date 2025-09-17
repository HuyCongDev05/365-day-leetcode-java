/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

 + Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]

 + Example 2:
Input: nums = [0]
Output: [0]
 */
import java.util.Arrays;

public class day_11 {
    public static void main(String[] args) {
        class Solution {
            public void moveZeroes(int[] nums) {
                int index = 0;
                for(int i=0; i<nums.length; i++){
                    if(nums[i]!=0){
                        int temp = nums[index];
                        nums[index] = nums[i];
                        nums[i] = temp;
                        index++;
                    }
                }
                System.out.println(Arrays.toString(nums));
            }
        }
        int[] arr = new int[] {0,1,0,3,12};
        Solution s = new Solution();
        s.moveZeroes(arr);
    }
}
