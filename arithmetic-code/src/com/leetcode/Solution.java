package com.leetcode;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution lt = new Solution();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        lt.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        /*沿着对角线元素互换位置*/
        int len = matrix.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - j][len - 1 - i];
                matrix[len - 1 - j][len - 1 - i] = temp;
            }
        }
        /*调换列元素*/
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len / 2; j++) {
                matrix[j][i] = matrix[len - 1 - j][i] ^ matrix[j][i];
                matrix[len - 1 - j][i] = matrix[len - 1 - j][i] ^ matrix[j][i];
                matrix[j][i] = matrix[len - 1 - j][i] ^ matrix[j][i];
            }
        }
        for (int[] arr : matrix)
            System.out.println(Arrays.toString(arr));
    }
}
