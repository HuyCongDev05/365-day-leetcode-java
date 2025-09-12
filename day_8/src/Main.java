/*
 + Example 1:
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
 + Example 2:
    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        class Solution {
            public int[] productExceptSelf(int[] nums) {
                int[] res = new int[nums.length];
                int core = 1;
                for ( int i = 0; i < nums.length; i++ ) {
                    for ( int j = 0; j < nums.length; j++ ) {
                        if (i != j) core = core * nums[j];
                    }
                    res[i] = core;
                    core = 1;
                }
                return res;
            }
        }
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}