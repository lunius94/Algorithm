package programmers.Lv1.success;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < moves.length; i++) {
            int index = moves[i]-1;
            for(int j = 0; j < board.length; j++) {
                int value = board[j][index];
                if(value!=0) {
                    if(!stack.isEmpty() && stack.peek()==value) {
                        stack.pop();
                        answer+=2;
                    }
                    else {
                        stack.push(value);
                    }
                    board[j][index]=0;
                    break;
                }
            }
        }
        return answer;
    }
}
