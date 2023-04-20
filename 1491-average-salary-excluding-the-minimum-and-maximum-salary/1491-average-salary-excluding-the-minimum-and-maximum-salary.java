class Solution {
    public double average(int[] salary) {
        
        int min=salary[1];
        int max=salary[1];
        double sum=0;
        
        for(int i=0;i<salary.length ;i++)
        {
            if(min>salary[i])
            {
                min=salary[i];
            }
            if(max<salary[i])
            {
                max=salary[i];
            }
        }
        
        
        for(int i=0 ; i<salary.length;i++)
        {
            sum+=salary[i];
        }
        
        double avg = sum-max-min;
        return avg/(salary.length-2);
        
    }
}