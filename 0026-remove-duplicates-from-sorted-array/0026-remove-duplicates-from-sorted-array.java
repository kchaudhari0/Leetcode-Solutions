class Solution {
    public int removeDuplicates(int[] nums) {
     
        LinkedHashSet<Integer> arr=new LinkedHashSet<>();
        
        for(int i=0 ;i<nums.length;i++)
        {
            arr.add(nums[i]);
        }
        
        int i = 0;

        for(int ele:arr){
            nums[i++] = ele;
        }
        
        return arr.size();
    }
}