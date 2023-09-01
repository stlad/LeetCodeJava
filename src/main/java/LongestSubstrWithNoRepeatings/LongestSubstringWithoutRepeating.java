package LongestSubstrWithNoRepeatings;// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args){
    }

}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxCnt = 0;
        int len = s.length();
        Set<Character> seen = new HashSet<>();

        while(left < len && right < len ){
            if(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left++));
            }
            else{
                seen.add(s.charAt(right++));
                maxCnt = Math.max(maxCnt, right - left);
            }
        }
        return maxCnt;
    }
}