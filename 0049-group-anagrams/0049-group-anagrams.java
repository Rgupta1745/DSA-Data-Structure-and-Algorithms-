class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> hashMap = new HashMap<>();
    
    for(int i = 0 ; i<strs.length ; i++){
       char[] ch = strs[i].toCharArray();
       Arrays.sort(ch);

       String key = new String(ch);

       if(!hashMap.containsKey(key)){
        hashMap.put(key , new ArrayList<>());
       }
       hashMap.get(key).add(strs[i]);
    }
    return new ArrayList<>(hashMap.values());
}
}