class Solution {
    public int thirdMax(int[] nums) {
        
       Long first = null, second = null, third = null;
        
        for (int num : nums) {
            Long current = (long) num;
            if (current.equals(first) || current.equals(second) || current.equals(third)) {
                continue;
            }
            
            if (first == null || current > first) {
                third = second;
                second = first;
                first = current;
            } else if (second == null || current > second) {
                third = second;
                second = current;
            } else if (third == null || current > third) {
                third = current;
            }
        }
        
        return third == null ? first.intValue() : third.intValue();
        
        
    }
}