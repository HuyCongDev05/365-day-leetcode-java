/*
 + Example 1:
    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
 + Example 2:
    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
 + Example 3:
    Input: str1 = "LEET", str2 = "CODE"
    Output: ""
 */
public class day_3 {
    public static void main(String[] args) {
        class Solution {
            public String gcdOfStrings(String str1, String str2) {
                String[] str1s = str1.split("");
                String[] str2s = str2.split("");
                String index = "";
                int max = Math.max(str1s.length, str2s.length);
                int ucln = 0;
                for (int i = 1; i <= max; i++) {
                    if (str1s.length % i == 0 && str2s.length % i == 0) {
                        ucln = i;
                    }
                }
                for (int i = 0; i < ucln; i++) {
                    if (str1s[i].equals(str2s[i])) {
                        index += str1s[i];
                    }
                }
                return index;
            }
        }
        Solution s = new Solution();
        System.out.println(s.gcdOfStrings("ABCABC", "ABC"));
    }
}