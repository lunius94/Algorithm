package backjoon.datastructure.stack.silver;

import java.io.*;
import java.util.*;

public class Q10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;

        str = str.replace("()","R");

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            String s = str.substring(i,i+1);

            if(s.equals("(")) {
                stack.push("(");
            }
            else if(s.equals(")")) {
                stack.pop();
                result++;
            }
            else {
                result += stack.size();
            }
        }

        System.out.println(result);
    }
}
