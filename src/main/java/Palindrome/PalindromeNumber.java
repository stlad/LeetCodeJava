//https://leetcode.com/problems/palindrome-number/
// Given an integer x, return true if x is a palindrome, and false otherwise.
// Follow up: Could you solve it without converting the integer to a string?

package Palindrome;

public class PalindromeNumber {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(1321));

    }



}

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int original = x;
        int reversed = x % 10;
        x=x/10;
        while(x>0){
            int digit = x%10;
            x=x/10;
            reversed = reversed * 10 + digit;
            System.out.println(reversed);
        }

        return reversed==original;
    }
}