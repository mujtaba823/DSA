class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<tokens.length;i++){
            switch(tokens[i]){
                case  "+":
                stack.push(  stack.pop() + (stack.pop()) );
                break;
                case   "-":
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
                break;
                case   "*":
                stack.push(  stack.pop() * stack.pop() );
                break;
                case  "/":
                 int d = stack.pop();
                 int c = stack.pop();
                stack.push(c / d);
                break;
                default :
                    stack.push(Integer.parseInt(tokens[i]));
                break;
            }
            //go

        }
        return stack.pop();
    }
}