class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1,diff=0;
        while(n>0)
        {
            int dig=n%10;
            n=n/10;
            sum=sum+dig;
            mul=mul*dig;
        }
        return mul-sum;
    }
}