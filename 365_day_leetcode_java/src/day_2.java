/*
 + Example 1:
    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r
 + Example 2:
    Input: word1 = "ab", word2 = "pqrs"
    Output: "apbqrs"
    Explanation: Notice that as word2 is longer, "rs" is appended to the end.
    word1:  a   b
    word2:    p   q   r   s
    merged: a p b q   r   s
 + Example 3:
    Input: word1 = "abcd", word2 = "pq"
    Output: "apbqcd"
    Explanation: Notice that as word1 is longer, "cd" is appended to the end.
    word1:  a   b   c   d
    word2:    p   q
    merged: a p b q c   d
 */
public class day_2 {
    public static void main(String[] args) {
        class Solution {
            public String mergeAlternately(String word1, String word2) {
                String[] word1s = word1.split("");
                String[] word2s = word2.split("");
                int length = Math.max(word1s.length, word2s.length);
                String word = "";
                for (int i = 0; i < length; i++) {
                    if (word1s.length - 1 < i) word += "";
                    else word += word1s[i];
                    for (int j = i; j <= i; j++) {
                        if (word2s.length - 1 < i) word += "";
                        else word += word2s[j];
                    }
                }
                return word;
            }
        }
        Solution s = new Solution();
        System.out.println(s.mergeAlternately("abc", "pqr"));
    }
}