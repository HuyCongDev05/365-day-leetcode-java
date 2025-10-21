import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 + Example 1:
    Input: s = "abc", t = "ahbgdc"
    Output: true
 + Example 2:
    Input: s = "axc", t = "ahbgdc"
    Output: false
 */
public class day_10 {
    public static void main(String[] args) {
        class Solution {
            public boolean isSubsequence(String s, String t) {
                int i = 0, j = 0;
                while(i < s.length() && j < t.length()) {
                    if(s.charAt(i) == t.charAt(j)) {
                        i++;
                        j++;
                    }else j++;
                }
                return i == s.length();
            }
        }
        Solution s = new Solution();
        System.out.println(s.isSubsequence("acb","ahbgdc"));
    }
}