class Solution {
  public int totalFruit(int[] trees) {
    int ans = 0;
    Map<Integer, Integer> Total = new HashMap<>();

    for (int i = 0, r = 0; r < trees.length; ++r) {
      Total.put(trees[r], Total.getOrDefault(trees[r], 0) + 1);
      while (Total.size() > 2) {
          
        Total.put(trees[i], Total.get(trees[i]) - 1);
        Total.remove(trees[i], 0);
        ++i;
      }
      ans = Math.max(ans, r - i + 1);
    }

    return ans;
  }
}