package backjoon.datastructure.stackandqueue.stack;
import java.io.*;
import java.util.*;

public class Q4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        map.put("(",")");
        map.put("[","]");

        while(true) {
            Stack<String> stack = new Stack<>();
            String str = br.readLine();
            if(str.equals(".")) break;
            str = str.replaceAll("[^()\\[\\]]","");
            for(int i = 0; i<str.length(); i++) {
                String c = str.substring(i,i+1);
                if(map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if(stack.isEmpty()) {
                        stack.push(c);
                        break;
                    }
                    else if(c.equals(map.get(stack.peek()))) {
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                        break;
                    }
                }
            }
            if(stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb.toString());
    }
}
