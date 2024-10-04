class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int childIndex = 0;
        int cookie = 0;
        int content = 0;
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        while (childIndex < g.length && cookie< s.length) {
            if (s[cookie] >= g[childIndex]) {
                content++;
                childIndex++;
            }
            cookie++;
        }
        
        return content;
    }
}