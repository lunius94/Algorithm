package backjoon.datastructure.stackandqueue.stack.silver;

import java.io.*;
import java.util.*;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        Stack<String> tmpStack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            stack.push(str.substring(i,i+1));
        }

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.equals("L") && !stack.isEmpty()) {
                tmpStack.push(stack.pop());
            }
            else if(word.equals("D") && !tmpStack.isEmpty()) {
                stack.push(tmpStack.pop());
            }
            else if(word.equals("B") && !stack.isEmpty()) {
                stack.pop();
            }
            else if(word.contains("P")) {
                String[] arr = word.split(" ");
                stack.push(arr[1]);
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
