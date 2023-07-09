package programmers.Lv2.success;
import java.util.*;

public class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0 ; i < s.length(); i++) {
            if(isCorrect(s)) {
                answer++;
            }
            s = turnString(s);
        }

        return answer;
    }

    private boolean isCorrect(String s) {
        Map<String, String> map = new HashMap<>();
        map.put(")","(");
        map.put("}","{");
        map.put("]","[");

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i,i+1);

            if(stack.isEmpty()) {
                if(tmp.equals(")") || tmp.equals("]") || tmp.equals("}")) {
                    return false;
                }
                else {
                    stack.push(tmp);
                }
            }
            else {
                String peek = stack.peek();
                if(peek.equals(map.get(tmp))) {
                    stack.pop();
                }
                else {
                    stack.push(tmp);
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }

    private String turnString(String s) {
        if(s.length() == 1) {
            return s;
        }

        s = s.substring(1) + s.substring(0,1);

        return s;
    }
}
