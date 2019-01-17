package com.leetcode;

/*验证回文字符串*/
/*给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

        说明：本题中，我们将空字符串定义为有效的回文串。

        示例 1:

        输入: "A man, a plan, a canal: Panama"
        输出: true
        示例 2:

        输入: "race a car"
        输出: false*/
public class Solution125 {
    public static void main(String[] args) {
        Solution125 lt = new Solution125();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(lt.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int index = 0, end = chs.length - 1;
        while (index < end) {
            if (!Character.isLetterOrDigit(chs[index])) {
                index++;
            } else if (!Character.isLetterOrDigit(chs[end])) {
                end--;
            } else if (Character.toLowerCase(chs[index]) == Character.toLowerCase(chs[end])) {
                index++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
