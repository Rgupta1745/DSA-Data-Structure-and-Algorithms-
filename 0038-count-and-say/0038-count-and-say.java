class Solution {
    public String RLE(String s){
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();

        char currentValue = ch[0];
        int currentCount = 0;

        for(char num:ch){
            if(num == currentValue ){
                currentCount++;
            }else{
                sb.append(currentCount);
                sb.append(currentValue);
                currentValue= num;
                currentCount= 1;
            }
            
        }
        sb.append(currentCount);
        sb.append(currentValue);
        return sb.toString();
    }
    public String countAndSay(int n) {
        if( n == 1) return "1";

        return RLE(countAndSay(n-1));
    }
}