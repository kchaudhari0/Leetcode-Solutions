class Solution {
    public int candy(int[] ratings) {
         int n = ratings.length;
        
        
        int[] arr=new int[n];
        int sum=0;
        if (n == 0) return 0;
        
        Arrays.fill(arr,1);
        
        for(int i =1 ; i < n ; i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                arr[i]=arr[i-1]+1;
            }
        }
        
        for(int j=n-2; j>=0 ;j-- )
        {
            if(ratings[j]>ratings[j+1])
            {
                arr[j]=Math.max(arr[j],arr[j+1]+1);
            }
        }
        
        for(int a: arr)
        {
            sum+=a;
        }     
        
        return sum;
    }
}