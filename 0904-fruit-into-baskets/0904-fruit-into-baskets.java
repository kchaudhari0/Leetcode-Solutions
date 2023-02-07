class Solution {
  public int totalFruit(int[] fruits) {
    int ans = 0;
    Map<Integer, Integer> total = new HashMap<>();

    for (int l = 0, r = 0; r < fruits.length; ++r) {
      total.put(fruits[r], total.getOrDefault(fruits[r], 0) + 1);
      while (total.size() > 2) {
        total.put(fruits[l], total.get(fruits[l]) - 1);
        total.remove(fruits[l], 0);
        ++l;
      }
      ans = Math.max(ans, r - l + 1);
    }

    return ans;
  }
}