package programmers.Lv2.success;
import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        String temp = "";
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < progresses.length; i++) {
            progresses[i] = (int)(Math.ceil((double)(100-progresses[i])/speeds[i]));
            if(q.isEmpty()||q.peek()>= progresses[i]) {
                q.offer(progresses[i]);
            }
            else {
                temp += q.size()+"+";
                q.clear();
                q.offer(progresses[i]);
            }
            if(i==progresses.length-1) temp+=q.size();
        }
        String[] arr = temp.split("\\+");
        answer = new int[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}
