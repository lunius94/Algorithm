package programmers.Lv1.success;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;
        for(int i = 0; i<answer.length; i++) {
            sum+= x;
            answer[i] = sum;
        }
        return answer;
    }
}
