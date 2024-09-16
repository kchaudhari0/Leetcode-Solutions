class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer , Integer> hm= new HashMap();
        int count=0;
        int ele=0;
        
        for(int n:nums)
        {
            hm.put(n,1+hm.getOrDefault(n,0));
            if(hm.get(n)>count)
            {
                ele=n;
                count=hm.get(n);
            }
        }
        
        return ele;
    }
}