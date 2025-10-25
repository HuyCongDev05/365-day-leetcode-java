import java.util.Arrays;

import static java.util.Arrays.stream;

public class day_16 {
    public static void main(String[] args) {
        class Solution {
            public int largestAltitude(int[] gain) {
                for ( int i = 1; i < gain.length; i++ ) {
                    gain[i] = gain[i-1] + gain[i];
                }
                int max =  Arrays.stream(gain).max().getAsInt();
                if (max > 0) return max;
                else return 0;
            }
        }
        Solution s = new Solution();
        System.out.println(s.largestAltitude(new int[] {52,-91,72}));
    }
}
