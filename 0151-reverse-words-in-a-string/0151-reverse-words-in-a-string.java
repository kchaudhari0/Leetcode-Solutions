class Solution {
    public String reverseWords(String s) {
        
        String[] str=s.split("\\s+");
        
        int size=str.length;
            
        StringBuilder sb=new StringBuilder();
            
          for(int i =size-1 ;i>=0; i--)  
          {
              sb.append(str[i]);
              sb.append(" ");
          }
        
        
        return sb.toString().trim();
    }
}