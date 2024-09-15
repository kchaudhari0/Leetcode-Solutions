class Solution {
    public int removeElement(int[] nums, int val) {
        
        int size=nums.length;
        
        int[] num=new int[size]; 
        int count=0 ; 
        
        for (int i=0 ; i< size ; i++)
        {
            if(nums[i]!=val)
            {
                num[count]=nums[i];
                count++;
            }
        }
        
        for(int i=0; i<size; i++)
        {
            nums[i]=num[i];
        }
        
        return count;
    }
}