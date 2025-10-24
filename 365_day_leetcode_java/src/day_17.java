/*
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000
 */
public class day_17 {
    public static void main(String[] args) {
        class Solution {
            public double findMaxAverage(int[] nums, int k) {
                double max_avg = -Double.MAX_VALUE, total = 0;
                for (int i = 0; i < k; i++) {
                    total += nums[i];
                    max_avg = total/k;
                }
                for (int i = k; i < nums.length; i++) {
                    total = total - nums[i -k] + nums[i];
                    if (max_avg < total/k) max_avg = total/k;
                }
                return max_avg;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(new int[]{-1},1));
    }
}
