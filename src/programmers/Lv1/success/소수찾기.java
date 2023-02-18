package programmers.Lv1.success;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        if(n>=2) answer++;
        for(int i = 3; i <=n; i+=2) {
            if(isPrime(i)) answer++;
        }
        return answer;
    }

    public boolean isPrime(int n) {
        double root = Math.sqrt(n);
        for(int i = 3; i<=root; i+=2) {
            if(n%i==0) return false;
        }
        return true;
    }
}
