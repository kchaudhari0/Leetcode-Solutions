class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
    
          HashSet<Integer> set=new HashSet<>();
          for(int itr:nums)
            set.add(itr);
        
          List<Integer> ans=new ArrayList<>();
        
          for(int i=1;i<=nums.length;i++)
            if(set.contains(i)==false)
              ans.add(i);
        
          return ans;
	
    }
}