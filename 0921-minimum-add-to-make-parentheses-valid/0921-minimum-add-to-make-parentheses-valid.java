class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int insertion = 0;
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else{
                if(!stack.empty()){
                    stack.pop();
                }else{
                    insertion++;
                }
            }
        }
        insertion+=stack.size();
        return insertion;
    }
    
}