class Solution {
    public int arraySign(int[] nums) {
        
        int plus=0 ,minus=0;
        
        for(int x:nums)
        { 
           if(x<0)
            {
                minus++;
            }
            else if( x==0)
            {
                return 0;
            }
            
            
        }
        if(minus%2==0)
        {
            return 1;
        }
        
        return -1;
        
    }
     
  }
