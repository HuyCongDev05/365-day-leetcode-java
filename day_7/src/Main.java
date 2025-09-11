/*
 + Example 1:
    Input: s = "the sky is blue"
    Output: "blue is sky the"
 + Example 2:
    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.
 + Example 3:
    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        class Solution {
            public String reverseWords(String s) {
                String[] arr = s.split(" ");
                List<String> list = new  ArrayList<>(Arrays.asList(arr));
                String string = "";
                list.removeIf(n -> n == "");
                Collections.reverse(list);
                for (int i = 0; i < list.size(); i++) {
                    string += list.get(i);
                    if (i != list.size() - 1) {
                        string += " ";
                    }
                }
                return string;
            }
        }
        Solution s = new Solution();
        System.out.println(s.reverseWords("  hello world  "));
    }
}