package programmers.Lv2.success;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <=n; i++) {
            if(i%2==1) {
                if(n%i==0) {
                    int a = n/i;
                    a -= i/2;
                    if(a>0) {
                        answer++;
                    }
                }
            }
            else {
                if(n%i*2==i && n/i*2>=i) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다
    public int solution1(int n) {
        int answer=0;
        for(int i = 1; i <=n; i+=2) {
            if(n%i==0) {
                answer++;
            }
        }
        return answer;
    }
}
