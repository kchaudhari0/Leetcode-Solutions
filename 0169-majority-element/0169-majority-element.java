class Solution {
    public int majorityElement(int[] nums) {
        
        //working in solving this in O(1) space , we will be using moore voting alogorithm
        
        int candidate=0;
        int count =0;
        
         for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
        
    }
}