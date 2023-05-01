class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> out=new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i =0 ; i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                out.add(i);
            }
            else if(nums[i]>target)
            {
                break;
            }
        }
        
        return out;
    }
    
    
}    