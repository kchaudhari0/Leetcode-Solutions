class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        /* Approch the problem from the last so that largest values are compared first and remaining element not needed any change */
        
        int end=m+n-1;
        int i=m-1;
        int j=n-1;
        
        while(j>=0)
        {
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[end--]=nums1[i--];
            }
            else{
                nums1[end--]=nums2[j--];
            }
        }
        
    }
}