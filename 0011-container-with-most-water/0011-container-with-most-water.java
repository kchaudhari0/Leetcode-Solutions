class Solution {
    public int maxArea(int[] height) {
        int left=0 ;
        int right= height.length-1;
        int maxStore=0;
            
         while(left<right)
         {
             int area=Math.min(height[left],height[right]);
             int currentWater=area*(right-left);
             
             maxStore = Math.max(maxStore , currentWater);
             
             if(height[left]<height[right])
             {
                left++; 
             }
             else
             {
                 right--;
             }
         }
        
        return maxStore;
    }
}