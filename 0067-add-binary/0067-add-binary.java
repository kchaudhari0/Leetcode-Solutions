class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int s1 = a.length() - 1;
        int s2 = b.length() - 1;
        int car = 0;
        while(s1 >= 0 || s2 >= 0){
            int sum = car;
            if(s1 >= 0) 
                sum += a.charAt(s1--) - '0';
            if(s2 >= 0) 
                sum += b.charAt(s2--) - '0';
            car = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }
        if(car != 0) 
            sb.append(car);
        return sb.reverse().toString();
    }
}