class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> charCount = new HashMap<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            charCount.put(ch , charCount.getOrDefault(ch,0)+1);
        }
        for(char ch : s.toCharArray()){
            if(charCount.get(ch) == 1){
                return count;
            }
            count++;
        }
        return -1;
    }
}