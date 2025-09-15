/*
 + Example 1:
    Input: nums = [1,2,3,4,5]
    Output: true
    Explanation: Any triplet where i < j < k is valid.
 + Example 2:
    Input: nums = [5,4,3,2,1]
    Output: false
    Explanation: No triplet exists.
 + Example 3:
    Input: nums = [2,1,5,0,4,6]
    Output: true
    Explanation: One of the valid triplet is (3, 4, 5), because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 */
public class day_9 {
    public static void main(String[] args) {
        class Solution {
            public boolean increasingTriplet(int[] nums) {
                boolean check = false;
                for (int i = 0; i < nums.length - 2; i++) {
                    if (nums[i] < nums[i+1] && nums[i+1] < nums[i + 2]) {
                        return true;
                    }else check = false;
                }
                return check;
            }
        }
        Solution s = new Solution();
        System.out.println(s.increasingTriplet(new int[] {20,100,10,12,5,13}));
    }
}