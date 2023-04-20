class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count=0;
        
        int size=nums.length;
        
        int[] arr=new int[size];
        
        for(int i=0 ; i<size;i++)
        {
            if(nums[i]!=val)
            {
                arr[count]=nums[i];
                count+=1;
            }
        }
        
        for(int i=0 ; i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
        
        return count;
    }
}