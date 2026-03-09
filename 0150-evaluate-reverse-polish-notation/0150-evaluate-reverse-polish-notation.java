class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token , operand1 , operand2);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    private static boolean isOperator( String token ){
        return token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*");
    }
    private static int performOperation(String operator , int operator_1 , int operator_2){
        switch(operator){
            case "+" :
            return operator_1 + operator_2;

            case "-" :
            return operator_1 - operator_2;

            case"*" :
            return operator_1 * operator_2;

            case"/":
            return operator_1 / operator_2;

            default :
            return 0;
        }
    }
}