/*
 + Example 1:
    Input: s = "abc", t = "ahbgdc"
    Output: true
 + Example 2:
    Input: s = "axc", t = "ahbgdc"
    Output: false
 */
public class Main {
    public static void main(String[] args) {
        class Solution {
            public boolean isSubsequence(String s, String t) {
                int index = 0;
                for (char char1 : s.toCharArray()) {
                    for (char char2 : t.toCharArray()) {
                        if (char1 == char2){
                            index++;
                            break;
                        }
                    }
                }
                return index == s.length();
            }
        }
        Solution s = new Solution();
        System.out.println(s.isSubsequence("abc","ahbgdc"));
    }
}