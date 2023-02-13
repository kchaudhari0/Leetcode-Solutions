class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left=0;
        int right =n;
        int i=0;
        
        int[] arr=new int[2*n];
        
        while(left<n)
        {
          arr[i++]=nums[left++];
          arr[i++]=nums[right++];
        }
        return arr;
    }
}