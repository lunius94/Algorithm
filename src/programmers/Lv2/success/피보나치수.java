package programmers.Lv2.success;

public class 피보나치수 {
    public int solution(int n) {
        int answer = 0;
        int[] fibonacci  = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i<=n; i++) {
            fibonacci[i] = (fibonacci[i-2] + fibonacci[i-1])%1234567;
        }
        answer = fibonacci[n];
        return answer;
    }
}
