package com.leetcode;

import java.util.Arrays;

/*加一*/
/*给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

        最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

        你可以假设除了整数 0 之外，这个整数不会以零开头。

        示例 1:

        输入: [1,2,3]
        输出: [1,2,4]
        解释: 输入数组表示数字 123。
        示例 2:

        输入: [4,3,2,1]
        输出: [4,3,2,2]
        解释: 输入数组表示数字 4321。*/
public class Solution66 {
    public static void main(String[] args) {
        Solution66 lt = new Solution66();
        int[] digits = new int[]{4, 3, 2, 1};
        lt.plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            digits[i] = digits[i] + 1;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = digits[i - 1];
        }
        return result;
    }
}
