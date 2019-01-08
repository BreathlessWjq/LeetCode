package com.leetcode;

import java.util.*;

/*两个数组的交集 II*/
/*给定两个数组，编写一个函数来计算它们的交集。

        示例 1:

        输入: nums1 = [1,2,2,1], nums2 = [2,2]
        输出: [2,2]
        示例 2:

        输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出: [4,9]
        说明：

        输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
        我们可以不考虑输出结果的顺序。
        进阶:

        如果给定的数组已经排好序呢？你将如何优化你的算法？
        如果 nums1 的大小比 nums2 小很多，哪种方法更优？
        如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？*/
public class Solution350 {
    public static void main(String[] args) {
        Solution350 lt = new Solution350();
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] result = lt.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    /*public int[] intersect(int[] nums1, int[] nums2) {
     *//*将第一个数组存入map数组中，其中将数组的数值存为map数组中的key值，value值为key值出现的次数*//*
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                list.add(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }*/

    /*进阶：如果给定的数组已经排好序呢？你将如何优化你的算法？*/
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cur1 = 0, cur2 = 0;
        List<Integer> list = new ArrayList<>();
        while (cur1 < nums1.length && cur2 < nums2.length) {
            if (nums1[cur1] == nums2[cur2]) {
                list.add(nums1[cur1]);
                cur1++;
                cur2++;
            } else if (nums1[cur1] > nums2[cur2]) {
                cur2++;
            } else {
                cur1++;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
