class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int temp =x;
        if(temp<0){
            return false;
        }
        while(temp!=0){
            int digit = temp%10;
            reversed=reversed*10+digit;
            temp/=10;
        }
        if(x==reversed){
            return true;
        }
        return false;
    }
}