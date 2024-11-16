class Solution {
    public int[] resultsArray(int[] nums, int k) {
        
        int n = nums.length;
        int[] results = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            results[i] = getPower(nums, i, i + k - 1);
        }
        
        return results;
    }
    
    private int getPower(int[] nums, int start, int end) {
        
        int prev = nums[start];
        for (int i = start + 1; i <= end; i++) {
            if (nums[i] != prev + 1) {
                return -1;
            }
            prev = nums[i];
        }
        
        return nums[end];
        
    }
}