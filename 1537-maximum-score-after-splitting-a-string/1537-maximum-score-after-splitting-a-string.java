class Solution {
    public int maxScore(String s) {
        int maxScore = 0;
        int zeros = 0;
        int ones = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }
        
        // Iterate through string except last character
        // (as we need at least one character on right side)
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }
            
            int currentScore = zeros + ones;
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
        
    }
}