package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*有效的字母异位词*/
/*给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

        示例 1:

        输入: s = "anagram", t = "nagaram"
        输出: true
        示例 2:

        输入: s = "rat", t = "car"
        输出: false
        说明:
        你可以假设字符串只包含小写字母。

        进阶:
        如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？*/
public class Solution242 {
    public static void main(String[] args) {
        Solution242 lt = new Solution242();
        String s = "aacc";
        String t = "ccac";
        System.out.println(lt.isAnagram(s, t));
    }
    /*菜鸡做法*/
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength != tLength) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sLength; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                continue;
            }
            map.put(s.charAt(i), 1);
        }
        for (int i = 0; i < tLength; i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) <= 0) {
                    return false;
                }
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                continue;
            }
            return false;
        }
        return true;
    }
    /*简洁做法*/
    /*public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        for(char c : s.toCharArray() ){
            counts[c-'a']++;
        }
        for(char c : t.toCharArray() ){
            counts[c-'a']--;
        }
        for(int cnt : counts){
            if(cnt != 0){
                return false;
            }
        }

        return true;
    }*/
}
