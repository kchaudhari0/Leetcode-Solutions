class Solution {
    public int countOdds(int low, int high) {
        
        int count=0;
        
        
        if(low%2==0 && high%2==0)
        {
             return count=(high-low)/2;
        }
        else 
            return count=((high-low)/2)+1;
        
            
        }
     
}