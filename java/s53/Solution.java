package Java.s53;

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum < num) {
                sum = num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Time:- O(n), Space:- O(1)