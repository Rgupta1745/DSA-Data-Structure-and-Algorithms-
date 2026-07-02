class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if(sLength != tLength) return false;

        HashMap<Character , Integer> hmap = new HashMap<>();

        for(int i = 0 ; i< sLength ; i++){
            hmap.put(s.charAt(i) , hmap.getOrDefault(s.charAt(i) , 0)+1);
            hmap.put(t.charAt(i) , hmap.getOrDefault(t.charAt(i) , 0)-1);
        }

        for(char ch : hmap.keySet()){
            if(hmap.get(ch) != 0){
                return false;
            }
        }
        return true ;
    }
}