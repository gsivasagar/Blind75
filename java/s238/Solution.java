package Java.s238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= prod;
            prod *= nums[i];
        }
        return ans;
    }
}

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Time:- O(n), Space:- O(1)
