package com.leetcode;

import java.util.Arrays;

/*只出现一次的数字*/
/*给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

        说明：

        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

        示例 1:

        输入: [2,2,1]
        输出: 1
        示例 2:

        输入: [4,1,2,1,2]
        输出: 4*/
public class Solution136 {
    public static void main(String[] args) {
        Solution136 lt = new Solution136();
        int[] nums = new int[]{4, 1, 2, 1, 2, 3, 3, 6, 7, 6, 7};
        int solution = lt.singleNumber(nums);
        System.out.println(solution);
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
            i++;
        }
        return nums[nums.length - 1];
    }

    /*最优解：利用异或特性*/
    /*特点1：0与任何数异或，就会变成任何数
    * 特点2：一个数与同一个数异或两次后，还是他本身
    * */
   /* public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }*/

}
