class Solution {
    public static int square(int num) {
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            sum += temp * temp;
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true){
            slow = square(slow);
            fast = square(square(fast));

            if(fast == 1){
                return true;
            }
            if(fast == slow){
                return false;
            }
        }
    }
}