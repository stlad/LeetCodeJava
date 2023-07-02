package MedianofTwoSortedArrays;
// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianofTwoSortedArrays {
    public static void main(String[] args){
        Solution sol = new Solution();
        double res = sol.findMedianSortedArrays(new int[]{0}, new int[]{});
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLen = nums1.length + nums2.length;
        int sortedArrLen = sumLen / 2 + 1;
        int[] sortedArr = new int[sortedArrLen];
        int i = 0;
        int j = 0;
        for(int index = 0; index < sortedArrLen;index++)
        {
            if(i<nums1.length && j<nums2.length){
                if(nums1[i] <= nums2[j]){
                    sortedArr[index] = nums1[i];
                    i++;
                }
                else{
                    sortedArr[index] = nums2[j];
                    j++;
                }
            }
            else if(i>= nums1.length){
                sortedArr[index] = nums2[j];
                j++;
            }
            else{
                sortedArr[index] = nums1[i];
                i++;
            }
        }

        if(sumLen % 2 == 0)
            return (double) (sortedArr[sortedArrLen-1] + sortedArr[sortedArrLen-2])/2;
        return sortedArr[sortedArrLen-1];
    }
}