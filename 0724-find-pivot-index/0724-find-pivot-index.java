class Solution {
    public int pivotIndex(int[] nums) {
        
         int left =0;
        int right=0;
        
        int size=nums.length;
        
        for(int i=0;i<size ;i++)
        {
            left+=nums[i];       
        }
         
        for(int i=0;i<size ;i++)
        {
            left-=nums[i];
            if (left==right)
            {
                return i;
            }
            
            right+=nums[i];
            
        }
        return -1;
        
        
    }
}