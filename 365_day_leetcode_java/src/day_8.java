/*
 + Example 1:
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
 + Example 2:
    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]
 */
import java.util.Arrays;

public class day_8 {
    public static void main(String[] args) {
        class Solution {
            public int[] productExceptSelf(int[] nums) {
                int n = nums.length;
                int[] res = new int[n];

                res[0] = 1;
                for (int i = 1; i < n; i++) {
                    res[i] = res[i - 1] * nums[i - 1];
                }

                int right = 1;
                for (int i = n - 1; i >= 0; i--) {
                    res[i] *= right;
                    right *= nums[i];
                }

                return res;
            }
        }
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}