package programmers.Lv2.success;

import java.util.*;

public class 짝지어제거하기 {
    public int solution(String s){
        Stack<String> stack = new Stack<>();

        for(int i = 0 ; i < s.length(); i++) {
            String tmp = s.substring(i,i+1);

            if(!stack.isEmpty() && stack.peek().equals(tmp)) {
                stack.pop();
            }
            else stack.push(tmp);
        }

        return stack.size()==0 ? 1 : 0;
    }
}
