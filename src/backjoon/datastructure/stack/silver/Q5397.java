package backjoon.datastructure.stack.silver;

import java.io.*;
import java.util.*;

public class Q5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            Stack<String> stack = new Stack<>();
            Stack<String> tmpStack = new Stack<>();

            String str = br.readLine();
            for(String s : str.split("")) {
                if(s.equals("<")) {
                    if(!stack.isEmpty()) tmpStack.push(stack.pop());
                }
                else if(s.equals(">")) {
                    if(!tmpStack.isEmpty()) stack.push(tmpStack.pop());
                }
                else if(s.equals("-")) {
                    if(!stack.isEmpty()) stack.pop();
                }
                else {
                    stack.push(s);
                }
            }
            StringBuilder sb = new StringBuilder();

            while(!stack.isEmpty()) {
                tmpStack.push(stack.pop());
            }

            while(!tmpStack.isEmpty()) {
                sb.append(tmpStack.pop());
            }

            System.out.println(sb.toString());
        }
    }
}
