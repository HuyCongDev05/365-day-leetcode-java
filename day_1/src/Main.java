import java.util.Arrays;
/*
 + Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 + Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
 + Example 3:
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/

public class Main {
    public static void main(String[] args) {
        class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n) {
                int[] arr = new int[m+n];
                for (int i = 0; i < m+n; i++) {
                    if (nums1[i] != 0) {
                        arr[i] = nums1[i];
                    }
                    if (i == m) {
                        for (int j = 0; j < n; j++) {
                            if (nums2[j] != 0) {
                                arr[i] = nums2[j];
                                i++;
                            }
                        }
                        break;
                    }
                }
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
            }
        }
        Solution s = new Solution();
        s.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}