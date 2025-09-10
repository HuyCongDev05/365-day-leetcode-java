/*
 + Example 1:
    Input: s = "IceCreAm"
    Output: "AceCreIm"
 + Explanation:
    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 + Example 2:
    Input: s = "leetcode"
    Output: "leotcede"
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        class Solution {
            public String reverseVowels(String s) {
                String[] arr1 = s.split("");
                List<String> list = new ArrayList<>();
                String[] arr3 = new String[] {"a","e","i","o","u"};

                for (int i = 0; i < arr1.length; i++) {
                    for (String character : arr3) {
                        if (arr1[i].toLowerCase().equals(character)) {
                            list.add(arr1[i]);
                            arr1[i] = "";
                            break;
                        }
                    }
                }
                Collections.reverse(list);
                int index = 0;
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i].isEmpty()) {
                        arr1[i] = list.get(index);
                        index++;
                    }
                }

                // Ghép string
                String str = "";
                for (String out : arr1) {
                    str += out;
                }
                return str;
            }
        }

        Solution s = new Solution();
        System.out.println(s.reverseVowels("leetcode"));
    }
}
