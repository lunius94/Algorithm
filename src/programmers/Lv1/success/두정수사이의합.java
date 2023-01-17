package programmers.Lv1.success;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;

        for(long i = Math.min(a,b); i<=Math.max(a,b); i++) {
            answer += i;
        }
        return answer;
    }

    public long solution1 (int a, int b) {
        long answer = 0;
        long max = Math.max(a,b);
        long min = Math.min(a,b);
        answer = (max-min+1)*(min+max)/2;
        return answer;
    }
}
