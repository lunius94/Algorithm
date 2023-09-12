package backjoon.datastructure.stackandqueue.queue.silver;

import java.io.*;
import java.util.*;

public class Q17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Queue<String> qu = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            qu.add(str.substring(i,i+1));
        }

        boolean isReverse = true;

        while(!qu.isEmpty()) {
            String tmp = qu.poll();
            if(tmp.equals("<")) {
                isReverse = false;

                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(tmp);
            }
            else if(tmp.equals(">")) {
                isReverse = true;
                sb.append(tmp);
            }
            else if(tmp.equals(" ")) {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(tmp);
            }
            else if(!isReverse) {
                sb.append(tmp);
            }
            else {
                stack.push(tmp);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
