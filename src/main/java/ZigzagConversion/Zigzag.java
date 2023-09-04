// https://leetcode.com/problems/zigzag-conversion/description/

package ZigzagConversion;
public class Zigzag {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.convert("PAYPALISHIRING", 3)); // -> PAHNAPLSIIGYIR
        System.out.println(sol.convert("PAYPALISHIRING", 4)); // - >PINALSIGYAHRPI
        System.out.println(sol.convert("A", 1)); // -> A
    }
}

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder[] lines = new StringBuilder[numRows];
        for(int i = 0; i<lines.length; lines[i++] = new StringBuilder());


        for(int i = 0 ; i < s.length(); i++){
            int lineNumber = getLineByOuterIndex(i, numRows);
            lines[lineNumber].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i<lines.length;i++){
            result.append(lines[i].toString());
        }
        return result.toString();
    }

    private static int getLineByOuterIndex(int outerIndex, int numRows){
        int T = getPeriod(numRows);
        int innerIndex = translateOuterToInnerIndex(outerIndex, T);

        int minIndex = findMinInnerIndex(T);
        if(innerIndex <= minIndex) return innerIndex;

        return minIndex - (innerIndex - minIndex);
    }

    private static int getPeriod(int numRows){
        return numRows * 2 - 2;
    }

    private static int translateOuterToInnerIndex(int outerIndex, int T){
        return outerIndex % T;
    }

    private static int findMinInnerIndex(int T){
        return T / 2;
    }
}