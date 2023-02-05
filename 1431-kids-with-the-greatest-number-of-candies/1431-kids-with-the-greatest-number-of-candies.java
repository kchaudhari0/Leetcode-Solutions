class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          List<Boolean> var = new ArrayList<>();
        int n = candies.length;
        
        int maxCandies = candies[0];
        for(int i=1; i<n; i++){
            maxCandies = Math.max(candies[i], maxCandies);
        }
        
        for(int i=0; i<n; i++){
            var.add(candies[i] + extraCandies >= maxCandies);
        }
        
        return var;
        
    }
}