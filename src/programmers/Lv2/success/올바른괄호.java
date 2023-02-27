package programmers.Lv2.success;

import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i,i+1);
            if(str.equals("(")) {
                stack.push(str);
            }
            else if(stack.isEmpty()) return false;
            else {
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
