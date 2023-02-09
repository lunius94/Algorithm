package programmers.Lv1.success;
import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        Stack<Integer> stack = new Stack<>();
        int answer = bfs(stack,0,0,d,budget);
        return answer;
    }

    private int bfs(Stack<Integer> stack, int index, int sum, int[] d, int budget) {
        int curSize = 0;
        for(int i = index; i<d.length; i++) {
            if(sum+d[i]<=budget) {
                stack.push(d[i]);
                sum += d[i];
                curSize = bfs(stack,i+1,sum,d,budget);
                stack.pop();
            }
        }
        return Math.max(curSize,stack.size());
    }

    public static void main(String[] args) {
        예산 sol = new 예산();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int result = sol.solution(d, budget);
        System.out.println(result);
    }
}
