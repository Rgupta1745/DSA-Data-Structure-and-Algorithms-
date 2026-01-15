class Solution {
    public boolean isPalindrome(int x) {
        int temp =x;
        int newNumber = 0;
        while(temp!=0){
            int n = temp%10;
            newNumber = newNumber*10+n;
            temp/=10;
        }
        if(newNumber == x && x >= 0) return true;

        return false;
    }
}