package Java.s11;

class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int curr = (Math.min(height[left], height[right - 1]) * (right - left - 1));
            max = Math.max(max, curr);
            if (height[left] < height[right - 1]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Time:- O(n), Space:-O(1)