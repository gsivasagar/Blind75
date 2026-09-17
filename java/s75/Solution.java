package Java.s75;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] >= nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Time:- O(nlogn), Space:- O(1)