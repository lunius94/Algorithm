package backjoon.datastructure;

import java.io.*;
import java.util.*;

public class Q10828{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++ ) {
            String str = br.readLine();

            if(str.indexOf("push")==0) {
                stack.push(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.equals("pop")) {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            }
            else if(str.equals("empty")) {
                if(stack.isEmpty()) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }
            }
            else if(str.equals("size")) {
                System.out.println(stack.size());
            }
            else {
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}