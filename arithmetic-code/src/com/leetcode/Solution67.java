package com.leetcode;

/*二进制求和*/
/* 给定两个二进制字符串，返回他们的和（用二进制表示）。
输入为非空字符串且只包含数字 1 和 0。
示例 1:
输入: a = "11", b = "1"
输出: "100"
示例 2:
输入: a = "1010", b = "1011"
输出: "10101"*/
public class Solution67 {
    public static void main(String[] args) {
        Solution67 lt = new Solution67();
        System.out.println(lt.addBinary("0", "1"));
    }

    public String addBinary(String a, String b) {
        /*创建适用于单线程下在字符缓冲区进行大量操作的容器*/
        StringBuilder str = new StringBuilder();
        int ALength = a.length() - 1;
        int BLength = b.length() - 1;
        /*记录进位数*/
        int carry = 0;
        while (ALength >= 0 || BLength >= 0) {
            int sum = carry;
            if (ALength >= 0) {
                sum += (a.charAt(ALength) - '0');
                ALength--;
            }
            if (BLength >= 0) {
                sum += (b.charAt(BLength) - '0');
                BLength--;
            }
            /*将相加结果赋值给str容器*/
            str.append(sum % 2);
            /*sum为单数时,进位为1,否则为0*/
            carry = sum / 2;
        }
        /*相加完,进位还为1时*/
        if (carry == 1) {
            str.append(1);
        }
        return str.reverse().toString();
    }
}
