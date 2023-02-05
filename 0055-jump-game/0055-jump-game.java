class Solution {
    public boolean canJump(int[] nums) {

       int size=0; 
        int n= nums.length;

    for (int i =0; i<=size;i++)
    {
        size = Math.max(size,i+nums[i]);
        if(size>=n-1)
        return true;
    }

    return false;
    }  
}