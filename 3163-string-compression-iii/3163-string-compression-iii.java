class Solution {
    public String compressedString(String word) {
        
        StringBuilder sb=new StringBuilder();
        
        
        int count=1;
        for(int i =0 ; i<word.length()-1;i++)
        {
            int current =word.charAt(i);
            if(current==word.charAt(i+1) && count<9)
            {
                count++;
            }
            else{
            
            sb.append(count);
            sb.append(word.charAt(i));
            count=1;
            }
            
            
        }
        if (!word.isEmpty()) {
            sb.append(count);
            sb.append(word.charAt(word.length() - 1));
        }
        
        
        return sb.toString();
        
    }
}