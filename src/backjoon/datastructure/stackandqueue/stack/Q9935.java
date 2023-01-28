package backjoon.datastructure.stackandqueue.stack;
import java.io.*;
import java.util.*;

public class Q9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String bomb = br.readLine();
        Stack<String> stack = new Stack<>();
        Stack<String> sub = new Stack<>();
        int length = bomb.length();

        for(int i =0; i< target.length(); i++) {
            stack.push(target.substring(i,i+1));
            if(stack.size()<length) {
                continue;
            }
            else if(stack.peek().equals(bomb.substring(length-1,length))) {
                sub.push(stack.pop());
                for(int j = length-1; j>0; j--) {
                    if(stack.peek().equals(bomb.substring(j-1,j))) {
                        sub.push(stack.pop());
                    }
                    else {
                        while(!sub.isEmpty()){
                            stack.push(sub.pop());
                        }
                        break;
                    }
                }
                if(sub.size()==length) sub.clear();
            }
        }
        if(stack.isEmpty()) System.out.println("FRULA");
        else {
            System.out.println(String.join("",stack.toArray(new String[0])));
        }
    }
}
