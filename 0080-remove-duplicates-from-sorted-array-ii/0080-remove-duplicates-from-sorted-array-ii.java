class Solution {
    public int removeDuplicates(int[] nums) {
        
         
        int j =0 ;
        
        
        for(int i=2 ; i<nums.length; i++)
        {
            if(nums[j]!=nums[i])
            {
                nums[j+2]=nums[i];
                j++;
            }
        }
        
        return j+2;
        
    }
}