package Java.s15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0, k = nums.length - 1;
        while (i < k) {
            int j = i + 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
            }

        }
    }
}
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]