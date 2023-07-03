package ReverseInteger;

// https://leetcode.com/problems/reverse-integer/description/

public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(new Solution().reverse(-2147483));
    }
}

class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        if(x == Integer.MIN_VALUE) return 0;

        x = Math.abs(x);
        Long result = (long) x % 10;
        x = x / 10;

        while(x>0){
            result = result*10 + (x % 10);
            if(result * sign > Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE)
                return 0;
            x = x / 10;
        }
        result *= sign;
        return  result.intValue();
    }
}
