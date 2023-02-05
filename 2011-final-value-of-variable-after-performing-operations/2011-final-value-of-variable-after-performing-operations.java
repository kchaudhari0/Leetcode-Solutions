class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int x=0;
        for(String A : operations)
        {
            if(A.equals("++X") || A.equals("X++"))
            {
                 x=x+1;
            }
            else
                x=x-1;
        }
        
        
        return x;
        
    }
}