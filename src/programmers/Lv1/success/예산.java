package programmers.Lv1.success;
import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i< d.length; i++) {
            budget-=d[i];
            if(budget>=0) answer++;
        }
        return answer;
    }
}
