package com.leetcode;
/*字符串中的第一个唯一字符*/
/*给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

        案例:

        s = "leetcode"
        返回 0.

        s = "loveleetcode",
        返回 2.


        注意事项：您可以假定该字符串只包含小写字母。*/
public class Solution387 {
    public static void main(String[] args) {
        Solution387 lt = new Solution387();
        String str = "loveleetcode";
        System.out.println(lt.firstUniqChar(str));
    }

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(String.valueOf(s.charAt(i))) == s.lastIndexOf(String.valueOf(s.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }
}
