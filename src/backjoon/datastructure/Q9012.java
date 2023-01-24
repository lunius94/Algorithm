package backjoon.datastructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Q9012{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < N; j++) {
            String s = br.readLine();

            String result = "YES";
            if(s.charAt(s.length()-1)=='(' || s.charAt(0)==')' || s.length()%2==1) {
                result = "NO";
            }
            else {
                for(int i = 0; i <s.length(); i++) {
                    if(s.charAt(i)=='(') {
                        stack.push(s.charAt(i));
                    }
                    else {
                        if(stack.isEmpty()) {
                            result= "NO";
                        }
                        else {
                            stack.pop();
                        }
                    }
                }
            }
            if(!stack.isEmpty()) result = "NO";
            System.out.println(result);
            stack.clear();
        }
    }
}