package com.leetcode;

import java.util.Scanner;

/*反转字符串*/
/*编写一个函数，其作用是将输入的字符串反转过来。

        示例 1:

        输入: "hello"
        输出: "olleh"
        示例 2:

        输入: "A man, a plan, a canal: Panama"
        输出: "amanaP :lanac a ,nalp a ,nam A"*/
public class Solution344 {
    public static void main(String[] args) {
        Solution344 lt = new Solution344();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lt.reverseString(str));

    }

    public String reverseString(String s) {
        char[] chs = s.toCharArray();
        for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
            chs[i] = (char) (chs[i] ^ chs[j]);
            chs[j] = (char) (chs[i] ^ chs[j]);
            chs[i] = (char) (chs[i] ^ chs[j]);
        }

        return String.valueOf(chs);
    }
}
