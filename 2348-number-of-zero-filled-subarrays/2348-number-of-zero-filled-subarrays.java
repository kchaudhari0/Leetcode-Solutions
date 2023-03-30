class Solution {
       public long zeroFilledSubarray(int[] nums) {
        long count = 0, arrayIndex = 0;
        for (int n : nums) {
            if (n == 0) {
                count += ++arrayIndex;
            }else {
                arrayIndex = 0;
            }
        }
        return count;
    }

}