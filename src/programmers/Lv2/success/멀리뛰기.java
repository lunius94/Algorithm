package programmers.Lv2.success;

public class 멀리뛰기 {
    public long solution(int n) {
        long answer = 0;
        long[] dp = new long[n+1];

        for(int i = 0; i < n+1; i++) {
            if(i==0) dp[i] = 0;
            else if(i==1) dp[i] = 1;
            else if(i==2) dp[i] = 2;
            else dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }
        answer = dp[n];
        return answer;
    }
}
