class Solution {
    public String reverseWords(String s) {
        
        String[] str=s.split("\\s+");
        
        int size=str.length;
            
            String out="";
            
          for(int i =size-1 ;i>=0; i--)  
          {
              out = out+ " " + str[i];
          }
        
        out=out.trim();
        return out;
    }
}