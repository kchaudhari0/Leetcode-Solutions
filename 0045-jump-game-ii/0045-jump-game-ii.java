class Solution {
    public int jump(int[] nums) {
        
        int size = nums.length;
        if (size <= 1) {
            return 0;
        }

        int jumps = 0;
        int currentMax = 0;
        int nextMax = 0;

        for (int i = 0; i < size - 1; i++) {
            nextMax = Math.max(nextMax, i + nums[i]);

            if (i == currentMax) {
                jumps++;
                currentMax = nextMax;

                if (currentMax >= size - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}