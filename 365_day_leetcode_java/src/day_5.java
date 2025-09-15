/*
 + Example 1:
    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true
 + Example 2:
    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false
 */
public class day_5 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,0,0,0,1};
        class Solution {
            public boolean canPlaceFlowers(int[] flowerbed, int n) {
                int count = 0;
                for(int i = 0; i < flowerbed.length; i++) {
                    if (flowerbed[i] == 0) {
                        boolean left = i == 0 || flowerbed[i-1] == 0;
                        boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                        if (left && right) {
                            flowerbed[i] = 1;
                            count++;
                        }
                    }
                }
                return count >= n;
            }
        }
        Solution s = new Solution();
        System.out.println(s.canPlaceFlowers(arr,2));
    }
}