class Solution {
    public int tribonacci(int n) {

        int T0=0;
        int T1=1;
        int T2=1;
        int sum=0;

        if (n==1 || n==2)
        {
            sum= 1;
        }
        else
        {
        for(int i=0; i<n-2 ; i++)
         
        {
            sum=T0+T1+T2;

            T0=T1;
            T1=T2;
            T2=sum;
        }

        }
        
        return sum;
    }
}