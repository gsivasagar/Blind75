package Java.s169;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == n / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
