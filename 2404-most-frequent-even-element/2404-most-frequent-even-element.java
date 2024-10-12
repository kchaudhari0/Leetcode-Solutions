class Solution {
    public int mostFrequentEven(int[] nums) {
        
    
        HashMap<Integer , Integer> hm= new HashMap<>();
        
         for (int num : nums) {
            if (num % 2 == 0) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }
        }
        
        if (hm.isEmpty()) {
            return -1;
        }
        
        int mostFrequent = Integer.MAX_VALUE;
        int maxFrequency = 0;
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency || (frequency == maxFrequency && num < mostFrequent)) {
                mostFrequent = num;
                maxFrequency = frequency;
            }
        }
        
        return mostFrequent;
    }
}