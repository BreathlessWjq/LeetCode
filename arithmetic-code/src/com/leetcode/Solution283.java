package com.leetcode;

import java.util.Arrays;

/*移动零*/
/*给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

        示例:

        输入: [0,1,0,3,12]
        输出: [1,3,12,0,0]
        说明:

        必须在原数组上操作，不能拷贝额外的数组。
        尽量减少操作次数。*/
public class Solution283 {
    public static void main(String[] args) {
        Solution283 lt = new Solution283();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        lt.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*本人写的渣渣解法*/
    /* public void moveZeroes(int[] nums) {
         for (int j = 0; j < nums.length; j++) {
             for (int i = 1; i < nums.length-j; i++) {
                 if (nums[i - 1] == 0) {
                     nums[i] = nums[i] ^ nums[i - 1];
                     nums[i - 1] = nums[i] ^ nums[i - 1];
                     nums[i] = nums[i] ^ nums[i - 1];
                 }
             }
         }
     }*/
    /*最优解*/
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
