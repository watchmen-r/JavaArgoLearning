package OthersEasy;

import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{{}}()"));
    }

    static boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();

        for(int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (tmp.equals("{") || tmp.equals("(") || tmp.equals("[")) {
                stack.push(tmp);
            } else {
                if(stack.empty()) return false;
                if(tmp.equals("}") && stack.peek().equals("{")) {
                    stack.pop();
                } else if(tmp.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else if(tmp.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }

}