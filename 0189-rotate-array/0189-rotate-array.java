class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        //Purpose of k = k % n:The line k = k % n is used to handle cases where the number of rotations (k) is larger than the length of the array (n).
        k = k % size;
        
        reverse(nums , 0, size-1);
        reverse(nums , 0, k-1);
        reverse(nums, k, size-1);
        
        
    }
    
    
    public void reverse(int[] arr , int start , int end)
    {
        while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        start++;
        end--;
        }
    }
}