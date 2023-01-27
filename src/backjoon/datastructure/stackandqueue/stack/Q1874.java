package backjoon.datastructure.stackandqueue.stack;
import java.io.*;
import java.util.*;

public class Q1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        List<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        for(int i = 1; i <= n; i++) {
            stack.push(i);
            list.add("+");
            if(!stack.isEmpty()) {
                while(arr[index]<=stack.peek()) {
                    if(arr[index]==stack.peek()) {
                        list.add("-");
                        stack.pop();
                        index++;
                        if(stack.isEmpty()) break;
                    } else {
                        break;
                    }
                }
            }
        }
        if(list.size()==2*n) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append("\n");
            }
            System.out.println(sb.toString());
        }
        else {
            System.out.println("NO");
        }

    }
}
